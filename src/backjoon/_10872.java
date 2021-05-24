package backjoon;
// https://www.acmicpc.net/problem/10872
// 팩토리얼
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10872 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    // sol1 반복문 사용
    // memory 11452 runtime 76
    /*
    int fac = 1;
    for(int i=1; i<=N; i++){
      fac *= i;
    }
    System.out.println(fac);
    */
    // sol2 재귀사용
    // memory 11480 runtime 76
    int sum = factorial(N);
    System.out.println(sum);
  }
  public static int factorial(int n){
    if(n <= 1) return 1;
    return n * factorial(n-1);
  }
}
/*
input
10
output
3628800
 */