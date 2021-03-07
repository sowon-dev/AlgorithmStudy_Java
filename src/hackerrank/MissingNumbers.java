package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MissingNumbers {

  static int[] missingNumbers(int[] arr, int[] brr) {
    //arr과 brr을 비교하여 brr에는 있지만 arr에는 없는 숫자(Missing Numbers)를 배열로 나타내는 문제.
    //두 배열을 각각 HashMap에 담은 뒤 brr 해쉬맵 - arr 해쉬맵을 통해 빠진 숫자를 효율적으로 찾을 수 있다.
    HashMap<Integer, Integer> hashmapA = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> hashmapB = new HashMap<Integer, Integer>();

    //arr을 HashMap으로 만든 뒤 반복되는 숫자가 있으면 value값을 1 누적합한다.
    for (int i : arr) {
      if (hashmapA.containsKey(i)) {
        hashmapA.put(i, hashmapA.get(i) + 1);
      } else {
        hashmapA.put(i, 1);
      }
    }

    //brr을 HashMap으로 만든 뒤 반복되는 숫자가 있으면 value값을 1 누적합한다.
    for (int j : brr) {
      if (hashmapB.containsKey(j)) {
        hashmapB.put(j, hashmapB.get(j) + 1);
      } else {
        hashmapB.put(j, 1);
      }
    }

    //HashMapB - HashMapA한 값을 리스트 diff에 담는다.
    ArrayList<Integer> diff = new ArrayList<Integer>();
    for (Integer i : hashmapB.keySet()) {
      if (hashmapA.get(i) == null || hashmapA.get(i) < hashmapB.get(i)) {
        diff.add(i);
      }
    }

    //리스트를 배열로 만든다.
    int[] result = new int[diff.size()];
    for (int i = 0; i < diff.size(); i++) {
      result[i] = diff.get(i);
    }

    System.out.println(Arrays.toString(result));
    return result;
  }

  public static void main(String[] args) {
    System.out.println(missingNumbers(new int[]{203, 204, 205, 206, 207, 208, 203, 204, 205, 206},
        new int[]{203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204})
        + ", ans: [204 205 206]");
  }
}
