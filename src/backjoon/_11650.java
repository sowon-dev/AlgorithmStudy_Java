package backjoon;
// https://www.acmicpc.net/problem/11650
// 좌표 정렬하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _11650 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //sol memory  runtime
    int N = Integer.parseInt(br.readLine());
    int[][] arr = new int[N][2];

    StringTokenizer st;
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr, new Comparator<int[]>() {
      @Override
      public int compare(int[] e1, int[] e2) {
        if(e1[0] == e2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
          return e1[1] - e2[1];
        } else {
          return e1[0] - e2[0];
        }
      }
    });

    // 위의 식을 람다로 표현하면 아래 주석과 같음
//    Arrays.sort(arr, (e1,e2) -> {
//      if(e1[0] == e2[0]){
//        return e1[1] - e2[1];
//      }else{
//        return e1[0] - e2[0];
//      }
//    });

    StringBuilder sb = new StringBuilder();
    for(int i = 0 ; i< N ; i++) {
      sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
    }
    System.out.println(sb);

  }
}
