package backjoon;
//https://www.acmicpc.net/problem/1929
// 소수구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1929 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    // sol1 memory 39996 run 1732
    /*
    for(int i=M; i<=N; i++){
      int j;
      for(j=2; j<=i; j++){
        // 소수가 아닐때
        if(i % j == 0 && i !=2){
          break;
        }
        if(j*j >= i && i != 1){
          System.out.println(i);
          break;
        }
      }
    }
    */
    // sol2 memory 18316 run 184
    boolean[] isNotPrime = new boolean[N + 1]; //기본값이 false
    isNotPrime[0] = isNotPrime[1] = true;
    for (int i = 2; i <= Math.sqrt(isNotPrime.length); i++) {
      if (isNotPrime[i]) {
        continue;
      }
      for (int j = i * i; j < isNotPrime.length; j += i) {
        isNotPrime[j] = true;
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = M; i <= N; i++) {
      if (!isNotPrime[i]) {
        sb.append(i).append('\n');
      }
    }
    System.out.println(sb);
  }
}
/*
input
3 16

output
3
5
7
11
13
 */