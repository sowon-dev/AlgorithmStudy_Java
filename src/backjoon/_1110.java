package backjoon;

// https://www.acmicpc.net/problem/1110
// 더하기 사이클

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _1110 {

  public static void main(String[] args) throws Exception {
    //sol1. memory 11500 runtime 84
    /*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int tens = 0; //십의 자리의 수
    int units = 0; //일의 자리의 수
    int sum = n;
    int cnt = 0;

    while(true){
      tens = sum/10;
      units = sum%10;
      sum = tens + units;

      sum = units*10 + sum%10;
      cnt++;
      if(n == sum){
        break;
      }
    }
    */

    //sol2. memory 18356 runtime 228
    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();

    // 입력 수가 10미만이면 n에 10을 곱함
    if (n < 10)
      n *= 10;

    int 첫째자리수 = 0;
    int 둘째자리수 = 0;
    int cnt = 0;
    int sum = n;

    while (true) {
      첫째자리수 = sum / 10;
      둘째자리수 = sum % 10;
      sum = 첫째자리수 + 둘째자리수;

      sum = 둘째자리수 * 10 + sum % 10; // 10이상의 수가 나왔을때 마지막 자리 수로 해야하기 때문
      cnt++;
      if (sum == n)
        break;
    }

    System.out.println(cnt);
  }
}
/*
input 26 output 4
 */