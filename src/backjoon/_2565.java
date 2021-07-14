package backjoon;
// https://www.acmicpc.net/problem/2565

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _2565 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int[][] firstWire = new int[N][2];
    int[] dp = new int[N];

    StringTokenizer st;
    for(int i = 0; i < firstWire.length; i++) {
      st = new StringTokenizer(br.readLine()," ");
      firstWire[i][0] = Integer.parseInt(st.nextToken());
      firstWire[i][1] = Integer.parseInt(st.nextToken());
    }

    // 왼쪽 전봇대를 기준으로 2차원 배열 정렬
    Arrays.sort(firstWire, new Comparator <int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
      }
    });

    for(int i=0; i<dp.length; i++){
      dp[i] = 1;
      for(int j=0; j<i; j++){
        if(firstWire[i][1] > firstWire[j][1]){
          dp[i] = Math.max(dp[i], dp[j]+1);
        }
      }
    }

    int max = 0;
    for(int i=0; i<N; i++){
      max = Math.max(max, dp[i]);
    }

    // 전체 전선 개수 - 최대 설치가능 개수 = 최소 철거가능 개수
    System.out.println(N-max);
  }
}
