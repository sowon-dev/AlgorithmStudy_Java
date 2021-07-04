package backjoon;
// https://www.acmicpc.net/problem/1149

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1149 {
  final static int Red = 0;
  final static int Green = 1;
  final static int Blue = 2;

  static int[][] Cost;

  public static void main(String[] args) throws IOException {
    // memory 12036 runtime 92
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Cost = new int[N][3];

    StringTokenizer st;
    for(int i = 0; i < N; i++) {

      st = new StringTokenizer(br.readLine(), " ");

      Cost[i][Red] = Integer.parseInt(st.nextToken());
      Cost[i][Green] = Integer.parseInt(st.nextToken());
      Cost[i][Blue] = Integer.parseInt(st.nextToken());
    }

    // 모든 경우의 수 중 최솟값을 더하기
    for (int i = 1; i < N; i++) {
      Cost[i][Red] += Math.min(Cost[i - 1][Green], Cost[i - 1][Blue]);
      Cost[i][Green] += Math.min(Cost[i - 1][Red], Cost[i - 1][Blue]);
      Cost[i][Blue] += Math.min(Cost[i - 1][Red], Cost[i - 1][Green]);
    }

    System.out.println(Math.min(Math.min(Cost[N - 1][Red], Cost[N - 1][Green]), Cost[N - 1][Blue]));
  }
}
/*
input
3
26 40 83
49 60 57
13 89 99

output
96
 */