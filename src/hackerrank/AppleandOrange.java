package hackerrank;

import java.util.Arrays;

public class AppleandOrange {

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    //s와 t사이에 떨어진 사과와 오렌지 갯수를 출력하는 문제.
    //int[] apples: 각각 n개의 사과가 떨어진 위치이고 a위치값을 더해준다
    //int[] oranges: n개의 오랜지가 떨어진 위치이고 b위치값을 더해준다.
    //연산한 두 배열의 요소가 s와 t사이에 있다면 각각의 갯수를 출력한다.
    int numOfapples = 0;
    int numOforanges = 0;
    for (int i = 0; i < apples.length; i++) {
      apples[i] += a;
      if (apples[i] >= s && apples[i] <= t) {
        numOfapples++;
      }
    }

    for (int j = 0; j < oranges.length; j++) {
      oranges[j] += b;
      if (oranges[j] >= s && oranges[j] <= t) {
        numOforanges++;
      }
    }
    System.out.println(numOfapples+"\n"+numOforanges);
  }

  public static void main(String[] args) {
    countApplesAndOranges(7, 10, 4, 12, new int[]{2, 3, -4}, new int[]{3, -2, -4});
    System.out.print(", ans: 1 2\n");

    countApplesAndOranges(5, 15, 3, 2, new int[]{-2, 2, 1}, new int[]{5, -6});
    System.out.print(", ans: 1 1\n");
  }
}
