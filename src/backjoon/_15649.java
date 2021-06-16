package backjoon;
// https://www.acmicpc.net/problem/15649
// N과 M (1)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15649 {
  public static int[] arr;
  public static boolean[] visit;
  public static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 19912 runtime 156
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    arr = new int[M];
    visit = new boolean[N];
    dfs(N, M, 0);
    System.out.println(sb);
  }

  public static void dfs(int N, int M, int depth) {
    // arr배열의 길이(depth)가 M과 같다면 출력
    if (depth == M) {
      for (int val : arr) {
        sb.append(val).append(' ');
      }
      sb.append('\n');
      return;
    }

    // 중복값 체크를 위한 visit배열
    for (int i = 0; i < N; i++) {
      if (!visit[i]) { // 사용여부판단
        visit[i] = true;
        arr[depth] = i + 1;
        dfs(N, M, depth + 1); // 재귀호출
        visit[i] = false; //하나의 재귀함수가 끝나면 false로 바꿔줘야 다시 i라는 숫자 사용가능
      }
    }
  }
}
/*
INPUT
4 2

OUTPUT
1 2
1 3
1 4
2 1
2 3
2 4
3 1
3 2
3 4
4 1
4 2
4 3
 */