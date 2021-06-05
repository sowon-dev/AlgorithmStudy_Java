package backjoon;
// https://www.acmicpc.net/problem/1436
// 영화감독 숌
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1436 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    // memory 158540 runtime 340
    int num = 666; // 666이 첫 영화시작이니까
    int cnt = 1; // 몇번째 영화인지
    while(N != cnt){
      num++;
      if(String.valueOf(num).contains("666")) {
        cnt++;
      }
    }
    System.out.println(num);
  }
}
/*
input
2

output
1666
 */