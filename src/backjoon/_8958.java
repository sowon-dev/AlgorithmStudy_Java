package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/8958
// OX퀴즈
public class _8958 {

  public static void main(String[] args) throws IOException {
    //sol memory 12580 time 112
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());
    for(int i=0; i<cnt; i++){
      String[] nums = br.readLine().split("");
      int sum = 0; //누적합
      int cntO = 0; //O의 연속 횟수

      for(String s : nums){
        if(s.equals("O")){
          cntO++;
          sum += cntO;
        }else{
          cntO = 0;
        }
      }
      System.out.println(sum);
    }
  }
}
/*
intput
2
OOXXOXXOOO
OOXXOOXXOO

5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX

output
10
9
7
55
30
 */