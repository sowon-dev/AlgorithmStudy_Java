package backjoon;
// https://www.acmicpc.net/problem/15652
// N과 M (4)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15652 {
  public static int[] arr;
  public static int N, M;
  public static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    // memory 13464 runtime 92
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    arr = new int[M];
    dfs(1,0);
    System.out.println(sb);
  }

  static void dfs(int current, int depth){

    if(depth == M){
      for(int v : arr){
        sb.append(v).append(" ");
      }
      sb.append("\n");
      return;
    }

    for(int i=current; i<=N; i++){
      arr[depth] = i;
      dfs(i, depth+1);
    }
  }
}
/*
input
4 2

output
1 1
1 2
1 3
1 4
2 2
2 3
2 4
3 3
3 4
4 4
 */