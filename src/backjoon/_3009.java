package backjoon;
// https://www.acmicpc.net/problem/3009
// 네 번째 점
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3009 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // sol memory 11452 runtime 76
    // 직사각형이 되기 위해서는 쌍을 이루지 않는 숫자를 찾으면 됨
    String[] coord_1 = br.readLine().split(" ");
    String[] coord_2 = br.readLine().split(" ");
    String[] coord_3 = br.readLine().split(" ");

    String x;
    String y;
    
    // x 좌표 비교해서 쌍이 없는 x좌표 찾기
    if(coord_1[0].equals(coord_2[0])){
      x = coord_3[0];
    } else if (coord_1[0].equals(coord_3[0])) {
      x = coord_2[0];
    } else {
      x = coord_1[0];
    }

    // y 좌표 비교해서 쌍이 없는 y좌표 찾기
    if (coord_1[1].equals(coord_2[1])) {
      y = coord_3[1];
    } else if (coord_1[1].equals(coord_3[1])) {
      y = coord_2[1];
    } else {
      y = coord_1[1];
    }

    System.out.println(x + " " + y);
  }
}
/*
INPUT
30 20
10 10
10 20

20 30
10 10
20 10

OUTPUT
30 10
 */