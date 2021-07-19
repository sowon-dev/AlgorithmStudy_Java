package backjoon;
// https://www.acmicpc.net/problem/1912

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1912 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    int[] numbers = new int[N];
    int[] dp = new int[N]; //누적합을 저장하는 배열 dp[2]면 dp[0]~dp[2]까지 누적합

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
    // numbers배열에 input 숫자들 담기
    for(int i=0; i<N; i++){
      numbers[i] = Integer.parseInt(st.nextToken());
    }

    // 초기화
    dp[0] = numbers[0];
    int max = numbers[0];

    for(int i=1; i<N; i++){
      dp[i] = Math.max(dp[i-1]+numbers[i], numbers[i]);
      // 최댓값 갱신
      max = Math.max(max, dp[i]);
    }
    System.out.println(max);
  }
}