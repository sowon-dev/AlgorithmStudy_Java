package backjoon;
// https://www.acmicpc.net/problem/2750
// 수 정렬하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2750 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    // memory 12528 runtime 144

    // 배열에 숫자 넣기
    int[] arr = new int[N];
    for(int i=0; i<N; i++){
      arr[i] = Integer.parseInt(br.readLine());
    }

    // 오름차순 정렬
    Arrays.sort(arr);

    // 출력
    for(int n : arr){
      System.out.println(n);
    }
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