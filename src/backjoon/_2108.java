package backjoon;
// https://www.acmicpc.net/problem/2108
// 통계학
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2108 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //sol memory 40392 runtime 264
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    // 입력값의 범위 : -4000 ~ 4000
    int[] arr = new int[8001];

    int sum = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    // median 과 mode 는 -4000~4000 을 제외한 수로 초기화하면 된다.
    int median = 0;
    int mode = 0;

    for(int i = 0; i < N; i++) {
      int value = Integer.parseInt(br.readLine());
      sum += value;
      arr[value + 4000]++;

      if(max < value) {
        max = value;
      }
      if(min > value) {
        min = value;
      }
    }

    int count = 0;	// 중앙값 빈도 누적 수
    int mode_max = 0; 	// 최빈값의 최댓값

    // 이전의 동일한 최빈값이 1번만 등장했을경우 true, 아닐경우 false
    boolean flag = false;

    for(int i = min + 4000; i <= max + 4000; i++) {

      if(arr[i] > 0) {

        // <중앙값 찾기
        if(count < (N + 1) / 2) {
          count += arr[i];	// i값의 빈도수를 count 에 누적
          median = i - 4000;
        }

        // 최빈값 찾기
        if(mode_max < arr[i]) {
          mode_max = arr[i];
          mode = i - 4000;
          flag = true;	// 첫 등장이므로 true 로 변경
        }
        // 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우
        else if(mode_max == arr[i] && flag == true) {
          mode = i - 4000;
          flag = false;
        }
      }
    }

    System.out.println((int)Math.round((double)sum / N));
    System.out.println(median);
    System.out.println(mode);
    System.out.println(max - min);
  }
}
/*
input
5
1
3
8
-2
2

output
2
2
1
10
 */