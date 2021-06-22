package backjoon;
// https://www.acmicpc.net/problem/2580

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2580 {

  public static int[][] arr = new int[9][9]; //스도쿠 판

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //sol memory 19172 runtime 388
    for (int i = 0; i < 9; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < 9; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    sudoku(0, 0);
  }

  public static void sudoku(int row, int col) {
    // 해당 행이 다 채워진 경우 다음행으로 가기
    if (col == 9) {
      sudoku(row + 1, 0);
      return;
    }

    // 행과 열이 다 채워진 경우 스도쿠 판 출력하기
    if (row == 9) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          sb.append(arr[i][j]).append(" ");
        }
        sb.append("\n");
      }
      System.out.println(sb);
      // 스도쿠 판을 채우는 방법이 여럿인 경우는 그 중 하나만을 출력하기 위해서 시스템 종료
      System.exit(0);
    }

    // 만약 해당 위치가 0 이라면 1부터 9까지 중 가능한 수 탐색
    if (arr[row][col] == 0) {
      for (int i = 1; i <= 9; i++) {
        // i 값이 중복되지 않는지 검사
        if (possibility(row, col, i)) {
          arr[row][col] = i;
          sudoku(row, col + 1);
        }
      }
      arr[row][col] = 0;
      return;
    }

    sudoku(row, col + 1);

  }

  public static boolean possibility(int row, int col, int value) {
    // 같은 행 검사
    for (int i = 0; i < 9; i++) {
      if (arr[row][i] == value) {
        return false;
      }
    }

    // 같은 열 검사
    for (int i = 0; i < 9; i++) {
      if (arr[i][col] == value) {
        return false;
      }
    }

    // 3*3 칸 검사
    int set_row = (row / 3) * 3; // value가 속한 3x3의 행의 첫 위치
    int set_col = (col / 3) * 3; // value가 속한 3x3의 열의 첫 위치

    for (int i = set_row; i < set_row + 3; i++) {
      for (int j = set_col; j < set_col + 3; j++) {
        if (arr[i][j] == value) {
          return false;
        }
      }
    }
    return true; // 중복되는 것이 없을 경우 true 반환
  }
}
/*
INPUT
0 3 5 4 6 9 2 7 8
7 8 2 1 0 5 6 0 9
0 6 0 2 7 8 1 3 5
3 2 1 0 4 6 8 9 7
8 0 4 9 1 3 5 0 6
5 9 6 8 2 0 4 1 3
9 1 7 6 5 2 0 8 0
6 0 3 7 0 1 9 5 2
2 5 8 3 9 4 7 6 0

OUTPUT
1 3 5 4 6 9 2 7 8
7 8 2 1 3 5 6 4 9
4 6 9 2 7 8 1 3 5
3 2 1 5 4 6 8 9 7
8 7 4 9 1 3 5 2 6
5 9 6 8 2 7 4 1 3
9 1 7 6 5 2 3 8 4
6 4 3 7 8 1 9 5 2
2 5 8 3 9 4 7 6 1
 */