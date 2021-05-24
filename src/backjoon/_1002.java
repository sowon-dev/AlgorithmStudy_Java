package backjoon;
// https://www.acmicpc.net/problem/1002
// 터렛
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1002 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 11840 runtime 96
    int caseCnt = Integer.parseInt(br.readLine());

    for(int i=0; i<caseCnt; i++){
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int r1 = Integer.parseInt(st.nextToken());

      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
      int r2 = Integer.parseInt(st.nextToken());

      // 두점간 거리 distance의 제곱
      int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	

      // 원이 하나고 반지름이 같을 경우 => 무한대
      if(x1 == x2 && y1 == y2 && r1 == r2) {
        System.out.println(-1);
      }
      // 두 원이 만나지 않을때
      else if(distance_pow > Math.pow(r1 + r2, 2)) {
        System.out.println(0);
      }
      // 원 안에 원이 있으나 내접하지 않을 때
      else if(distance_pow < Math.pow(r2 - r1, 2)) {
        System.out.println(0);
      }
      // 내접
      else if(distance_pow == Math.pow(r2 - r1, 2)) {
        System.out.println(1);
      }
      // 외접
      else if(distance_pow == Math.pow(r1 + r2, 2)) {
        System.out.println(1);
      }
      else {
        System.out.println(2);
      }
    }
  }
}
/*
input
3
0 0 13 40 0 37
0 0 3 0 7 4
1 1 1 1 1 5

output
2
1
0
 */