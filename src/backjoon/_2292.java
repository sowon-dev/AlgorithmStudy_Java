package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2292
// 벌집
public class _2292 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 11448 runtime 76
    int N = Integer.parseInt(br.readLine());
    int cnt = 1;
    int range = 2;	// 다음 줄로 넘어가는 벌집의 범위 (최솟값 기준)

    if (N == 1) {
      System.out.print(1);
    } else {
      while (range <= N) {
        // 방의 범위는 6의 배수라서 (6 * cnt)임
        range = range + (6 * cnt);
        cnt++;
      }
      System.out.print(cnt);
    }
  }
}
/*
input
13

output
3
 */