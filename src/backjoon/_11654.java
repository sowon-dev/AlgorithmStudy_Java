package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11654
// 아스키 코드
public class _11654 {

  public static void main(String[] args) throws IOException {
    //memory 11484 runtime 80
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int c = br.readLine().charAt(0);
    System.out.println(c);
  }
}
/*
input
A
output
65
 */