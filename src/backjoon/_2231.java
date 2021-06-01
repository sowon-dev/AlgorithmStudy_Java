package backjoon;
// https://www.acmicpc.net/problem/2231
// 분해합
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 11484 runtime 88
    int N = Integer.parseInt(br.readLine());
    int min = 0;

    for(int i = 0; i < N; i++) {
      int number = i;
      int sum = 0;	// 각 자릿수 합 변수

      while(number != 0) {
//        System.out.println("number: "+number+" , "+number%10 +" , "+number/10 + ", sum: "+sum);
        sum += number % 10;	// 각 자릿수 더하기
        number /= 10;
      }

      if(sum + i == N) {
        min = i;
        break;
      }
    }
    System.out.println(min);
  }
}
/*
input
216

output
198
 */