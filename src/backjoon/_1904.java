package backjoon;
// https://www.acmicpc.net/problem/1904

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1904 {
  // 첫 번째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 1,000,000)
  // memory 51820 runtime 264
  public static int[] dp = new int[1000001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    //피보나치 수열
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 2;

    // -1로 초기화
    for(int i=3; i < dp.length; i++ ){
      dp[i] = -1;
    }

    System.out.println(Tile(N));
  }

  static int Tile(int n){
    if(dp[n] == -1){
      dp[n] = (Tile(n-1) + Tile(n-2)) % 15746;
    }
    return dp[n];
  }

}
/*
input
4

output
5
 */