package hackerrank;

import java.util.Arrays;

public class IceCreamParlor {
  static int[] icecreamParlor(int m, int[] arr) {
    // 아이스크름 맛종류 배열인 arr에서 가지고 있는 돈 m으로 두가지 맛을 사려면 몇번째 맛을 골라야하는 지를 리턴하는 문제이다.
    int[] result = new int[2];

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (m == (arr[i] + arr[j])) {
          result[0] = i + 1;
          result[1] = j + 1;
          break;
        }
      }
    }

    System.out.println(Arrays.toString(result));
    return result;
  }

  public static void main(String[] args) {
    System.out.println(icecreamParlor(4, new int[] {1, 4, 5, 3, 2}) + ", ans: [1 4]");
    System.out.println(icecreamParlor(4, new int[] {2, 2, 4, 3}) + ", ans: [1 2]");
  }
}
