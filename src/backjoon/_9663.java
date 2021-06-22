package backjoon;
// https://www.acmicpc.net/problem/9663
// N-Queen
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9663 {

  public static int[] arr;
  public static int N;
  public static int count = 0;

  public static void main(String[] args) throws IOException {
    // memory 12052 runtime 5728
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    arr = new int[N];

    nQueen(0);
    System.out.println(count);
  }

  public static void nQueen(int depth) {
    // 모든 원소를 다 채운 상태면 count 증가 및 return
    if (depth == N) {
      count++;
      return;
    }

    for (int i = 0; i < N; i++) {
      arr[depth] = i;
      // 놓을 수 있는 위치일 경우 재귀호출
      if (Possibility(depth)) {
        nQueen(depth + 1);
      }
    }

  }

  public static boolean Possibility(int col) {

    for (int i = 0; i < col; i++) {
      // 같은 행에 존재할 경우
      if (arr[col] == arr[i]) {
        return false;
      }
      // 대각선상에 놓여있는 경우
      else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
        return false;
      }
    }

    return true;
  }
}
/*
input
8

output
92
 */