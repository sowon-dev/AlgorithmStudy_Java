package backjoon;
// https://www.acmicpc.net/problem/10870
// 피보나치 수 5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10870 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 11468 runtime 84
    int n = Integer.parseInt(br.readLine());
    int first = 0;
    int second = 1;
    int fibonacci = first + second;

    if(n==0){
      System.out.println(0);
    }
    if(n==1){
      System.out.println(1);
    }
    if(n>1){
      for(int i=1; i<n; i++){
        fibonacci = first + second;
        first = second;
        second = fibonacci;
      }
      System.out.println(fibonacci);
    }
  }
}
/*
input
10

output
55
 */