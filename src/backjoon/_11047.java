package backjoon;
// https://www.acmicpc.net/problem/11047

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11047 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken()); // 동전 종류
    int K = Integer.parseInt(st.nextToken()); // 가치

    int[] coin = new int[N];

    for(int i = 0; i < N; i++) {
      coin[i] = Integer.parseInt(br.readLine());
    }

    int min = 0;
    for(int i= N-1; i >= 0; i--){
      if(coin[i] <= K){
        min += (K / coin[i]);
        K = K % coin[i];
      }
    }
    System.out.println(min);
  }
}
