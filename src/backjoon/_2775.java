package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2775
// 부녀회장이 될테야
public class _2775 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 11412 runtime 84
    int leng = Integer.parseInt(br.readLine());

    // 15층 아파트 생성
    int[][] APT = new int[15][15];

    for(int i = 0; i < 15; i++) {
      APT[i][1] = 1;	// i층 1호는 항상 1명
      APT[0][i] = i;	// 0층 1명씩 증가하는 누적합
    }

    for(int i = 1; i < 15; i ++) {	// 층별
      for(int j = 2; j < 15; j++) {	// 호별 -> 1호는 항상 1명이니까 2호부터
        APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
      }
    }

    for(int i=0; i<leng; i++){
      int k = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      System.out.println(APT[k][n]);
    }
  }
}
