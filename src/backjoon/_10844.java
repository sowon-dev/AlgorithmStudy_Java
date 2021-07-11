package backjoon;
// https://www.acmicpc.net/problem/10844
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10844 {

  static Long[][] dp;
  static int N;
  final static long MOD = 1000000000;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    dp = new Long[N + 1][10];

    // 첫번째 자릿수는 1로 초기화
    for(int i = 0; i < 10; i++) {
      dp[1][i] = 1L;
    }

    long result = 0;

    // 마지막 자릿수인 1~9까지의 경우의 수를 모두 더해준다.
    for(int i = 1; i <= 9; i++) {
      result += recur(N, i);
    }
    System.out.println(result % MOD);
  }

  static long recur(int digit, int val) {

    if(digit == 1) {
      return dp[digit][val];
    }

    // 해당 자리수의 val값에 대해 탐색하지 않았을 경우
    if(dp[digit][val] == null) {
      // val이 0일경우 다음은 1밖에 못옴
      if(val == 0) {
        dp[digit][val] = recur(digit - 1 ,1);
      }
      // val이 1일경우 다음은 8밖에 못옴
      else if(val== 9) {
        dp[digit][val] = recur(digit - 1, 8);
      }
      // 그 외의 경우는 val-1과 val+1 값의 경우의 수를 합한 경우의 수가 됨
      else {
        dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
      }
    }
    return dp[digit][val] % MOD;
  }
}
