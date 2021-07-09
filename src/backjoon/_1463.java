package backjoon;
// https://www.acmicpc.net/problem/1463
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1463 {

  static Integer[] dp;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    dp = new Integer[N+1];
    dp[0] = dp[1] = 0;

    System.out.println(makeOne(N));
  }

  static int makeOne(int n){
    if(dp[n] == null){
      // 6으로 나눠지는 경우
      if(n%6 == 0){
        dp[n] = Math.min(makeOne(n-1), Math.min(makeOne(n/3), makeOne(n/2))) + 1;
      }
      // 3으로만 나눠지는 경우
      else if(n%3 == 0){
        dp[n] = Math.min(makeOne(n/3), makeOne(n-1))+1;
      }
      // 2로만 나눠지는 경우
      else if(n%2 == 0){
        dp[n] = Math.min(makeOne(n/2), makeOne(n-1))+1;
      }
      // 빼기 1로만 되는 경우
      else{
        dp[n] = makeOne(n-1)+1;
      }
    }
    return dp[n];
  }
}
/*
input
10

output
3
 */