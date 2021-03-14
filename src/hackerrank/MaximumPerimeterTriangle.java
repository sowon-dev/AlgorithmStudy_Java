package hackerrank;

import java.util.Arrays;

public class MaximumPerimeterTriangle {

  static int[] maximumPerimeterTriangle(int[] sticks) {
    // a non-degenerate triangle이 되는 가장 긴 둘레를 구하는 문제
    // a non-degenerate triangle 3가지 조건
    // 1. a+b>c
    // 2. a+c>b
    // 3. b+c>a

    int[] answerArr = new int[3];
    Arrays.sort(sticks);

    // non-degenerate triangle의 조건 만족하는 지 확인하기
    // 반복문을 통해서 answerArr요소는 조건에 부합하는 가장 큰 숫자가 된다.-> 가장 긴 둘레 조건 충족
    boolean isNonDegenerateTriangle = false;
    for (int i = 0; i < sticks.length - 2; i++) {
      int a = sticks[i];
      int b = sticks[i + 1];
      int c = sticks[i + 2];

      if ((a + b) > c && (a + c) > b && (b + c) > a) {
        answerArr[0] = a;
        answerArr[1] = b;
        answerArr[2] = c;
        isNonDegenerateTriangle = true;
      }
    }

    if (!isNonDegenerateTriangle) {
      return new int[]{-1};
    }

    System.out.print(Arrays.toString(answerArr));
    return answerArr;
  }

  public static void main(String[] args) {
    System.out.println(maximumPerimeterTriangle(new int[]{1, 2, 3, 4, 5, 10}) + ", ans: [3,4,5]");
    System.out.println(maximumPerimeterTriangle(new int[]{1, 1, 1, 3, 3}) + ", ans: [1,3,3]");
    System.out.println(maximumPerimeterTriangle(new int[]{1,1,1,2,3,5}) + ", ans: [1,1,1]");
  }
}
