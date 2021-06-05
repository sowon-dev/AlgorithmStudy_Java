package backjoon;
// https://www.acmicpc.net/problem/2751
// 수 정렬하기 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// 2750 수 정렬하기 방식인 Arrays.sort()로 풀면 시간초과가 된다.
public class _2751 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    // sol1 시간초과로 실패
    /*
    // 배열에 오름차순으로 숫자 넣기
    int[] arr = new int[N];
    arr[0] = Integer.parseInt(br.readLine());
    for(int i=1; i<N; i++){
      int n = Integer.parseInt(br.readLine());
      if(n < arr[i-1]){
        arr[i] = arr[i-1];
        arr[i-1] = n;
      }
    }
    // 출력
    for(int n : arr){
      System.out.println(n);
    }
    */

    // sol2 System.out.println으로 출력하면 시간초과 발생 -> StringBuilder  사용
    // memory 160156 runtime 1396
    StringBuilder sb = new StringBuilder();
    // 리스트에 숫자넣기
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++) {
      list.add(Integer.parseInt(br.readLine()));
    }
    // 오름차순 정렬
    Collections.sort(list);
    // 출력
    for(int value : list) {
      sb.append(value).append('\n');
    }
    System.out.println(sb);
  }
}
/*
input
5
5
2
3
4
1

output
1
2
3
4
5
 */