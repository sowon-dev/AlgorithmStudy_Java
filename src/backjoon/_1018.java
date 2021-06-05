package backjoon;
// https://www.acmicpc.net/problem/1018
// 체스판 다시 칠하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018 {
  public static boolean[][] arr;
  public static int min = 64; //8*8판이므로 가장 많이 칠할 수 있는 최대값

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 11840 runtime 84
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    arr = new boolean[N][M];

    // 배열 생성
    for (int i = 0; i < N; i++) {
      String str = br.readLine();

      for (int j = 0; j < M; j++) {
        // 흰색일때 true
        if (str.charAt(j) == 'W') {
          arr[i][j] = true;
        }
        // 검정색일때 false
        else {
          arr[i][j] = false;
        }
      }
    }

    // 둘째줄부터 시작
    for (int i = 0; i < N - 7; i++) {
      for (int j = 0; j < M - 7; j++) {
        findMin(i, j);
      }
    }

    System.out.println(min);
  }
  
  public static void findMin(int x, int y) {
    int count = 0;
    boolean color_yn = arr[x][y];	// 첫 번째 칸의 색

    for (int i = x; i < x + 8; i++) {
      for (int j = y; j < y + 8; j++) {

        // 올바른 색이 아닐경우 색을 바꿔줘야하므로 count 1 증가
        if (arr[i][j] != color_yn) {
          count++;
        }
        // 다음 칸은 반대색으로 변경
        color_yn = (!color_yn);
      }
      color_yn = !color_yn;
    }

    count = Math.min(count, 64 - count);
    min = Math.min(min, count);
    }
}
