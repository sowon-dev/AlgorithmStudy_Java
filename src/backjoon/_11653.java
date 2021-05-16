package backjoon;
// https://www.acmicpc.net/problem/11653
// 소인수분해

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _11653 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    //sol memory 11556 runtime 100

    List<Integer> primeNum = new ArrayList<>();
    for(int i=2; i<= Math.sqrt(N); i++){
      // 약수일때
      while (N % i == 0) {
        sb.append(i).append('\n');
        N /= i;
      }
    }
    // Math.sqrt(N)에는 자기 자신이 약수일때가 포함이 안되므로 따로 포함해준다
    if (N != 1) {
      sb.append(N);
    }
    System.out.println(sb);
  }
}
/*
input 72

output
2
2
2
3
3
 */