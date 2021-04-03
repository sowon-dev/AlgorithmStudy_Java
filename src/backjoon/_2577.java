package backjoon;
// https://www.acmicpc.net/problem/2577
// 숫자의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577 {
  public static void main(String[] args) throws IOException {
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    int multiply = a*b*c; //a,b,c 각각 100보다 크고 1000보다 작기때문에 int로 선언

    // 0부터 9까지의 배열 생성
    int[] arr = new int[10];
      
    // sol1 String의 charAt으로 연산
    // memory 11468 runtime 76
    /*
    String s = String.valueOf(multiply);

    for (int i = 0; i < s.length(); i++) {
      arr[(s.charAt(i) - 48)]++; //문자코드 '0'은 48이기때문에 48을 빼준다.
    }

    for (int v : arr) {
      System.out.println(v);
    }
    */

    // sol2 자리수로 연산
    // memory 11512 runtime 76
    while(multiply != 0) {
      arr[multiply%10]++;
      multiply/=10;
    }
    for(int result : arr) {
      System.out.println(result);
    }
  }
}
/*
input
150
266
427

output
3
1
0
2
0
0
0
2
0
0
 */
