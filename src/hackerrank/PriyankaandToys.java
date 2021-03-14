package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PriyankaandToys {
  static int toys(int[] w) {
    // 컨테이너 1대에 적재된 모든 품목의 무게는 최소 무게 품목의 무게에 4를 더한 것보다 작거나 같아야함.
    // 이때 필요한 가장 작은 컨테이너 갯수를 리턴하는 문제이다.
    int minContainers = 1;

    Arrays.sort(w);
//    System.out.println(Arrays.toString(w));

    int start = w[0] + 4;
    for (int j : w) {
      if ((j > start)) {
        //컨테이너 1대에 시작하는 최소 무게를 수정한다.
        start = j + 4;
        minContainers++;
      }
    }

    return minContainers;
  }

  public static void main(String[] args) {
    System.out.println(toys(new int[]{1,2,3,4,5,10,11,12,13})+", ans: 2");
    System.out.println(toys(new int[]{1,2,3,21,7,12,14,21})+", ans: 4");
  }
}
