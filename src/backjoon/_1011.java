package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1011
// Fly me to the Alpha Centauri
public class _1011 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //sol memory 11656 runtime 84
    int cnt = Integer.parseInt(br.readLine());
    for(int i =0; i<cnt; i++){
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      int distance = y-x;
      int max = (int) Math.sqrt(distance); //거리의 제곱근

      if(max == Math.sqrt(distance)){
        System.out.println(max * 2 - 1);
      }else if(distance <= max * max + max){
        System.out.println(max * 2);
      }else {
        System.out.println(max * 2 + 1);
      }

    }
  }
}
/*
input
3
0 3
1 5
45 50

output
3
3
4
 */