package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
  //absolute difference 절대편차 <= 1 일때의 가장 긴 list의 길이를 출력하는 뮨제이다
  public static int pickingNumbers(List<Integer> a) {
    // 문제의 조건에서 0< a[i] <100이므로 maxIndex는 100이다.
    int maxIndex = 100;
    int[] temp = new int[maxIndex];

    //0부터 99까지의 숫자배열에 a의 요소와 동일한 숫자가 있으면 1씩 카운트룰 증가시킨다.
    //예를 들어 a = [1,2,1]인경우 temp[1]=2이고 temp[2]=1이다.
    for (int number : a) {
      temp[number]++;
    }

    int result = 0;

    for (int i = 0; i < maxIndex - 1; i++) {
      result = Math.max(result, temp[i] + temp[i + 1]);
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println(pickingNumbers(new ArrayList<>(Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5)))+", ans: 5");
    System.out.println(pickingNumbers(new ArrayList<>(Arrays.asList(4, 6, 5, 3, 3, 1)))+", ans: 3");
    System.out.println(pickingNumbers(new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 2)))+", ans: 5");
    System.out.println(pickingNumbers(Arrays.asList(98, 3, 99, 1, 97, 2)) == 2);
    System.out.println(pickingNumbers(Arrays.asList(1, 1, 1)) == 3);
  }
}
