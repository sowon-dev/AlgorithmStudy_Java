package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1978
// 소수 찾기
// 소수란 1과 자기 자신으로만 나눠떨어지는 1보다 큰 양의 정수
public class _1978 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //sol memory 11560 runtim 76
    br.readLine(); // N은 쓰지않고 버림
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int cnt = 0;
    
    while(st.hasMoreTokens()){
      // 소수인경우 true, 아닌경우 false
      boolean isPrime = true;

      int num = Integer.parseInt(st.nextToken());
      if(num == 1) {
        continue;
      }
      for(int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        cnt++;
      }
    }
        System.out.println(cnt);
  }
}
/*
input
4
1 3 5 7

output
3
 */