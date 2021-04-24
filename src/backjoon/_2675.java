package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2675
// 문자열 반복
public class _2675 {

  public static void main(String[] args) throws IOException {
    //memory 11536 runtime 96
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());

    for(int i = 0; i < T; i++) {

      String[] str = br.readLine().split(" ");
      // String to int
      int R = Integer.parseInt(str[0]);
      String S = str[1];

      for(int j = 0; j < S.length(); j++) {
        for(int k = 0; k < R; k++) {
          System.out.print(S.charAt(j));
        }
      }
      System.out.println();
    }
  }
}
/*
input
2
3 ABC
5 /HTP

output
AAABBBCCC
/////HHHHHTTTTTPPPPP
 */
