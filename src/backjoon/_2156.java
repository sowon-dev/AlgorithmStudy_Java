package backjoon;
// https://www.acmicpc.net/problem/2156

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2156 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[] arr = new int[N+1];
    int[] dp = new int[N+1];

    for(int i = 1; i <= N; i++){
      arr[i] = Integer.parseInt(br.readLine());
    }

    dp[1] = arr[1];
    if (N > 1) {
      dp[2] = arr[1] + arr[2];
    }
    for (int i = 3; i <= N; i++) {
      dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));

    }
    System.out.println(dp[N]);

  }
}
/*
input
6
6
10
13
9
8
1

output
33
 */