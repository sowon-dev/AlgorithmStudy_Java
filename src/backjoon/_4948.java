package backjoon;
// https://www.acmicpc.net/problem/4948
// 베르트랑 공준

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4948 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //sol memory 24172 runtime 164
    int cnt = 0;
    while(true){
      int N = Integer.parseInt(br.readLine());
      if(N == 0) break;
      boolean[] isNotPrime = new boolean[N*2+1]; //기본값이 false
      isNotPrime[0] = isNotPrime[1] = true;
      for (int i = 2; i <= Math.sqrt(isNotPrime.length); i++) {
        if (isNotPrime[i]) {
          continue;
        }
        for (int j = i * i; j < isNotPrime.length; j += i) {
          isNotPrime[j] = true;
        }
      }
      //N보다 크고 2N보다 작거나 같기때문에 N+1을 해준다.
      for (int i = N+1; i <= N*2; i++) {
        if (!isNotPrime[i]) {
          cnt++;
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