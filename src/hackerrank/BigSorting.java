package hackerrank;

import java.util.Arrays;

public class BigSorting {
  static String[] bigSorting(String[] unsorted) {
    long[] arr = new long[unsorted.length];

    for(int i = 0; i<unsorted.length; i++){
      arr[i] = Long.parseLong(unsorted[i]);
    }
    Arrays.sort(arr);

    for(int i=0; i<arr.length; i++){
      unsorted[i] = Object.toString(arr[i]);
    }
    return unsorted;
  }

  public static void main(String[] args) {
    System.out.println(bigSorting(new String[]{"1", "200", "150", "3"}) + ", ans: [1 3 150 200]");
  }
}
