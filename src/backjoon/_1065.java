package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1065
// 한수
// 한자리수의 한수 개수: 9 (1~9)
// 두자리수의 한수 개수: 99 (1~99)
// 예를 들어, 110의 한수 개수: 99 (1~99)
// 예를 들어, 111의 한수 개수: 100 (1~99 + 111 = 총 100개)
public class _1065 {

  public static void main(String[] args) throws IOException {
    //memory 11496 run 84
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int cnt;

    if(n < 100 ){
      System.out.println(n);
    }else{
      cnt = 99;
      for(int i=100; i<=n; i++){
        int hundreds = i / 100 % 10;
        int tens = i / 10 % 10;
        int units = i % 10;
        
        // 등차수열인지 확인하기
        if ((hundreds - tens) == (tens - units)) {
          cnt++;
        }
        
      }
      // 엣지케이스
      if (n == 1000){
        cnt--;
      }

      System.out.println(cnt);
    }

  }
}
/*
input
110
1
210

output
99
1
105
 */