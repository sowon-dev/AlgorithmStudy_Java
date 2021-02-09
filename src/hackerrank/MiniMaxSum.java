package hackerrank;

import java.util.Arrays;

public class MiniMaxSum {

  static void miniMaxSum(int[] arr) {
    //sol1
    /*
    long minSum = 0;
    long maxSum = 0;

    Arrays.sort(arr);

    for(int i=0; i<arr.length-1; i++){
      minSum += arr[i];
    }

    for(int i=1; i<arr.length; i++){
      maxSum += arr[i];
    }
    System.out.print(minSum+" "+maxSum);
*/
    //sol2
    Arrays.sort(arr);
    long min = 0, max = 0;
    for(int i = 0, j = arr.length - 1; i < arr.length - 1; i++, j--){
      max = max + arr[j];
      min = min + arr[i];
    }
    System.out.print(min+" "+max);

  }

  public static void main(String[] args) {
    int[] arr1 = {1, 3, 5, 7, 9};
    int[] arr2 = {1, 2, 3, 4, 5};
    int[] arr3 = {256741038, 623958417, 467905213, 714532089, 938071625};

    miniMaxSum(arr1);
    System.out.print(", ans: 16 24 \n");
    miniMaxSum(arr2);
    System.out.print(", ans: 10 14 \n");
    miniMaxSum(arr3);
    System.out.print(", ans: 2063136757 2744467344 \n");
  }
}