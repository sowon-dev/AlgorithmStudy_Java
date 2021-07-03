package backjoon;
// https://www.acmicpc.net/problem/9461

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9461 {
  // 1 ≤ N ≤ 100
  public static Long[] seq = new Long[101];

  public static void main(String[] args) throws IOException {
    // memory 11504 runtime 88
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    seq[0] = 0L;
    seq[1] = 1L;
    seq[2] = 1L;
    seq[3] = 1L;

    int N = Integer.parseInt(br.readLine());
    for(int i=N; i>0; i--){
      sb.append(padovan(Integer.parseInt(br.readLine()))).append('\n');
    }
    System.out.println(sb);
  }
  public static long padovan(int N) {
    if(seq[N] == null) {
      seq[N] = padovan(N - 2) + padovan(N - 3);
    }
    return seq[N];
  }
}
/*
INPUT
2
6
12

OUTPUT
3
16
 */