package backjoon;
// https://www.acmicpc.net/problem/15651
// N과 M (3)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15651 {
  public static int[] arr;
  public static int N, M;
  public static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    // memory 111924 runtime 372
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    arr = new int[M];
    dfs(0);
    System.out.println(sb);
  }

  static void dfs(int depth){

    if(depth == M){
      for(int v : arr){
        sb.append(v).append(" ");
      }
      sb.append("\n");
      return;
    }

    for(int i=1; i<=N; i++){
      arr[depth] = i;
      dfs(depth+1);
    }
  }
}
/*
INPUT
4 2

OUTPUT
1 1
1 2
1 3
1 4
2 1
2 2
2 3
2 4
3 1
3 2
3 3
3 4
4 1
4 2
4 3
4 4
 */