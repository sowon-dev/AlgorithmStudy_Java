package backjoon;
// https://www.acmicpc.net/problem/2562
// 최댓값

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int max = 0; //자연수가 주어지므로 선언을 Integer.MIN_VALUE이 아닌 0으로 함
    int i = 0; //인덱스값
    int[] arr = new int[9]; //서로 다른 9개의 자연수를 넣을 배열

    // sol1 memory 11476 runtime 76
    /*

    //배열에 숫자넣기 -> 배열이 있어야지 index값을 구할 수 있음
    for(i=0; i<arr.length; i++){
      arr[i] = Integer.parseInt(br.readLine());
      max = Math.max(arr[i], max);
    }

    //배열 인덱스 구하기
    for(int j =0; j<arr.length; j++){
      if(arr[j] == max){
        i = j+1;
      }
    }
    */

    // sol2 for문 한번만 사용하기
    // memory 11444 runtime 76
    for(int j=0; j<arr.length;j++) {
      arr[j] = Integer.parseInt(br.readLine());
      if(max < arr[j]) {
        max = arr[j];
        i = j+1;
      }
    }

    System.out.println(max);
    System.out.println(i);
  }
}
/*
input
3
29
38
12
57
74
40
85
61
output
85
8
 */