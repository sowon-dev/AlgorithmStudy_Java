package backjoon;
// https://www.acmicpc.net/problem/2581
// 소수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2581 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //sol memory 11492 run 84
    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());
    int sum = 0;
    int min = 10001;// 문제에 주어짐
    int minCnt = 0;

    for (int i = M; i <= N; i++) {
      int j;
      for (j = 2; j < Math.sqrt(N); j++) {
        // 소수가 아닐때
        if (i % j == 0) {
          break;
        }
      }
      // 소수일때
      if (j * j > i && i != 1) {
        sum += i;
        // 가장 첫번째 소수가 최소값이 된다.
        if (minCnt == 0) {
          min = i;
        }
        minCnt++;
      }
    }
    if (minCnt == 0) {
      System.out.println(-1);
    } else {
      System.out.println(sum);
      System.out.println(min);
    }
  }
}
/*
input
60
100

output
620
61
 */
