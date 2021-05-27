package backjoon;
// https://www.acmicpc.net/problem/2447
// 별찍기 - 10
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2447 {
  // 전역변수
  static char[][] arr;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    arr = new char[N][N];

    // 별찍기 재귀
    star(0, 0, N, false);

    //출력하기
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        sb.append(arr[i][j]);
      }
      sb.append('\n');
    }
    System.out.print(sb);
  }

  static void star(int x, int y, int N, boolean blank) {
    // 빈칸넣기
    if (blank) {
      for (int i = x; i < x + N; i++) {
        for (int j = y; j < y + N; j++) {
          arr[i][j] = ' ';
        }
      }
      return;
    }

    // 더이상 쪼갤 수 없는 블록일 때 별넣기
    if (N == 1) {
      arr[x][y] = '*';
      return;
    }

    int size = N / 3; // 3의 배수를 3으로 다 나눈다.
    int count = 0; // 별 출력 누적을 의미
    for (int i = x; i < x + N; i += size) {
      for (int j = y; j < y + N; j += size) {
        count++;
        if (count == 5) { // 3X3인 경우 항상 5번째 칸이 공백 칸이다.
          star(i, j, size, true);
        } else {
          star(i, j, size, false);
        }
      }
    }
  }
}
/*
input
27

output
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************
*********         *********
* ** ** *         * ** ** *
*********         *********
***   ***         ***   ***
* *   * *         * *   * *
***   ***         ***   ***
*********         *********
* ** ** *         * ** ** *
*********         *********
***************************
* ** ** ** ** ** ** ** ** *
***************************
***   ******   ******   ***
* *   * ** *   * ** *   * *
***   ******   ******   ***
***************************
* ** ** ** ** ** ** ** ** *
***************************
 */