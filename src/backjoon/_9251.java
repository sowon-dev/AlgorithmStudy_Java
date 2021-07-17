package backjoon;
// https://www.acmicpc.net/problem/9251

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9251 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] str1 = br.readLine().toCharArray();
    char[] str2 = br.readLine().toCharArray();

    int length_1 = str1.length;
    int length_2 = str2.length;

    int[][] dp = new int[length_1 + 1][length_2 + 1];

    for(int i = 1; i <= length_1; i++) {
      for(int j = 1; j <= length_2; j++) {

        // (i-1)과 (j-1) 번째 문자가 서로 같은 경우
       if(str1[i - 1] == str2[j - 1]) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        }

        // (i-1)과 (j-1) 번째 문자가 서로 다른 경우
        else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }
    System.out.println(dp[length_1][length_2]);
  }
}
/*
input
ACAYKP
CAPCAK

output
4
 */