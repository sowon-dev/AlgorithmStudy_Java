package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2579 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int[] DP = new int[N + 1];
    int[] arr = new int[N + 1];

    for (int i = 1; i <= N; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    // index = 0 은 시작점이다.
    DP[1] = arr[1];

    // N 이 1이 입력될 수도 있기 때문에 예외처리를 해줄 필요가 있다.
    if (N >= 2) {
      DP[2] = arr[1] + arr[2];
    }

    for (int i = 3; i <= N; i++) {
      DP[i] = Math.max(DP[i - 2], DP[i - 3] + arr[i - 1]) + arr[i];
    }

    System.out.println(DP[N]);

  }
}
