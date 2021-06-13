package backjoon;
// https://www.acmicpc.net/problem/10814
// 나이순정렬
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _10814 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 62992 runtime 2084
    int N = Integer.parseInt(br.readLine());
    String[][] arr = new String[N][2];

    for(int i=0; i<N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      arr[i][0] = st.nextToken();
      arr[i][1] = st.nextToken();
    }
    
    Arrays.sort(arr, new Comparator<String[]>() {
      @Override
      public int compare(String[] o1, String[] o2) {
        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]); //나이만 비교
      }
    });

    for(int i=0; i<N; i++){
      System.out.println(arr[i][0] + " " + arr[i][1]);
    }
  }
}
/*
INPUT
3
21 Junkyu
21 Dohyun
20 Sunyoung

OUTPUT
20 Sunyoung
21 Junkyu
21 Dohyun
 */