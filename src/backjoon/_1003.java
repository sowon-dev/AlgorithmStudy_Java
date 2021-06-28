package backjoon;
// https://www.acmicpc.net/problem/1003
// 피보나치 함수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1003 {
  public static int cntZero = 0;
  public static int cntOne = 0;
  static int zero_plus_one;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i=0; i<T; i++){
      int n = Integer.parseInt(br.readLine());
      fibonacci(n);
      sb.append(cntZero).append(' ').append(cntOne).append("\n");
//      cntZero = 0;
//      cntOne = 0;
    }
    System.out.println(sb);
  }

  // sol1 시간초과
  /*
  static int fibonacci(int n){
    if(n == 0){
      cntZero++;
      return 0;
    } else if (n == 1){
      cntOne++;
      return 1;
    } else {
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
  */

  // so2 memory 11432 runtime 76
  // 규칙을 찾아서 풀기
  static void fibonacci(int N) {
    // 반드시 초기화 해야한다.
    cntZero = 1;
    cntOne = 0;
    zero_plus_one = 1;

    for (int i = 0; i < N; i++) {
      cntZero = cntOne;
      cntOne = zero_plus_one;
      zero_plus_one = cntZero + cntOne;
    }

  }
}
/*
input
3
0
1
3

output
1 0
0 1
1 2
 */