package backjoon;
// https://www.acmicpc.net/problem/11053

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11053 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] seq = new int[N];
    Integer[] dp = new Integer[N];

    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    for(int i = 0; i < N; i++) {
      seq[i] = Integer.parseInt(st.nextToken());
    }

    for(int i = 0; i < N; i++) {
      dp[i] = 1;
      // 0 ~ i 이전 원소들 탐색
      for(int j = 0; j < i; j++) {
        if(seq[j] < seq[i] && dp[i] < dp[j] + 1) {
          dp[i] = dp[j] + 1;	// j번째 원소의 +1 값이 i번째 dp가 된다.
        }
      }
    }
    
    // 최대 길이 찾기
    int max = -1;
    for(int i = 0; i < N; i++) {
      max = dp[i] > max ? dp[i] : max;
    }
    System.out.println(max);
  }
}
/*
input
6
10 20 10 30 20 50

output
4
 */