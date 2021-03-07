package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestNumbers {
  static int[] closestNumbers(int[] arr) {
    // 가장 작은 절대 편차를 가지고 있는 요소들을 배열로 리턴하는 문제
    Arrays.sort(arr);

    // smallest diff 찾기
    int minNum = arr[1] - arr[0];
    for (int i = 2; i < arr.length; i++) {
      minNum = Math.min(minNum, arr[i] - arr[i - 1]);
    }

    // 절대편차인 minNum과 동일한 요소를 길이를 알 수 없기에 ArrayList로 넣는다.
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 1; i < arr.length; i++) {
      if ((arr[i] - arr[i - 1]) == minNum) {
        result.add(arr[i - 1]);
        result.add(arr[i]);
      }
    }

    // ArrayList를 Array로 변환하기
    int[] resultArr = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      resultArr[i] = result.get(i);
    }

    System.out.print("result: " + Arrays.toString(resultArr));
    return resultArr;
  }

  public static void main(String[] args) {
    System.out.println(closestNumbers(new int[] { 5, 2, 3, 4, 1 }) + ", ans: [1 2 2 3 3 4 4 5]");
    System.out.println(closestNumbers(new int[] { -5, 15, 25, 71, 63 }) + ", ans: [63 71]");
    System.out.println(closestNumbers(new int[] { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854 })
        + ", ans: [-20 30]");
    System.out.println(closestNumbers(new int[] { -20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457,
        -6461594, 266854, -520, -470 }) + ", ans: [-520 -470 -20 30]");
    System.out.println(closestNumbers(new int[] { 5, 4, 3, 2 }) + ", ans: [2 3 3 4 4 5]");
  }
}
