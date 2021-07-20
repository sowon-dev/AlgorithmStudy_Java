package backjoon;
// https://www.acmicpc.net/problem/12865

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _12865 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken()); // 물품 수
    int K = Integer.parseInt(st.nextToken()); // 버틸 수 있는 무게

    int[] W = new int[N + 1]; // 무게
    int[] V = new int[N + 1]; // 가치
    int[] dp = new int[K + 1];


    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      W[i] = Integer.parseInt(st.nextToken());
      V[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 1; i <= N; i++) {

      // K부터 담을 수 있는 무게 한계치가 초과하지않을때 까지 반복
      for (int j = K; j - W[i] >= 0; j--) {
        dp[j] = Math.max(dp[j], dp[j - W[i]] + V[i]);
      }
    }
    System.out.println(dp[K]);

  }
}
