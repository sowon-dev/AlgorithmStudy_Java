package backjoon;
// https://www.acmicpc.net/problem/1932

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _1932 {
  static int[][] arr; //삼각형이 저장되는 2차원배열
  static Integer[][] dp;
  static int N;

  // memory 26600 runtime 260
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    arr = new int[N][N];
    dp = new Integer[N][N];
    StringTokenizer st;
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine(), " ");

      for (int j = 0; j < i + 1; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    for (int i = 0; i < N; i++) {
      dp[N - 1][i] = arr[N - 1][i];
    }

    System.out.println(func(0, 0));
  }
  static int func(int depth, int idx) {
    // 마지막 행일 경우 현재 위치의 dp값 반환
    if(depth == N - 1)
      return dp[depth][idx];

    // 탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교
    if (dp[depth][idx] == null) {
      dp[depth][idx] = Math.max(func(depth + 1, idx), func(depth + 1, idx + 1)) + arr[depth][idx];
    }
    return dp[depth][idx];

  }
}
/*
input
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5

output
30
 */