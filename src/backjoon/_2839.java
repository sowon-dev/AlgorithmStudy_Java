package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2839
// 설탕
public class _2839 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 11492 runtime 76
    int min = 0;
    int N = Integer.parseInt(br.readLine());

    while(true){
      // 5의 배수인 경우 출력
      if(N % 5 == 0){
        min += N/5;
        break;
      }
      // 5의 배수가 아닌 경우 N에서 3을 빼주고 회수는 1 더해준다.
      N -= 3;
      min++;

      if(N < 0){
        min = -1;
        break;
      }
    }
    System.out.println(min);
  }
}
/*
input
18

output
4
 */
