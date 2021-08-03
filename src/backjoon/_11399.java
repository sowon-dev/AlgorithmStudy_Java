package backjoon;
// https://www.acmicpc.net/problem/11399

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11399 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int[] arr = new int[N];

    for(int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    // 정렬
    Arrays.sort(arr);

    int prev = 0;	// 이전까지의 대기시간 누적합
    int sum = 0;	// 사람별 대기시간 총합

    for(int i = 0; i < N; i++) {
      // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
      sum += prev + arr[i];

      // 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
      prev += arr[i];
    }
    System.out.println(sum);
  }
}
/*
5
3 1 4 3 2

32
 */