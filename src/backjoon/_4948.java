package backjoon;
// https://www.acmicpc.net/problem/4948
// 베르트랑 공준

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4948 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = 0;
    while(true){
      int N = Integer.parseInt(br.readLine());
      if(N == 0){
        break;
      }
      for(int i=N; i<=2*N; i++){
        int j;
        for(j=2; j<i; j++){
          // 소수가 아닐때
          if(i % j == 0 && i != 2){
            break;
          }
          if(j*j >= i && i != 1){
            cnt++;
            break;
          }
        }
      }
      System.out.println(cnt);
      cnt = 0;
    }
  }
}
/*
input
1
10
13
0

100
1000
10000
100000
0

output
1
4
3
21
135
1033
8392
 */