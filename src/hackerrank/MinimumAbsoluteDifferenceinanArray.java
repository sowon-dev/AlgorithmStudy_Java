package hackerrank;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceinanArray {
  static int minimumAbsoluteDifference(int[] arr) {
    //가장 작은 절대편차를 리턴하는 문제
    //sol1 -> Time limit exceeded
    /*
    //배열 오름차순으로 정렬하기
    Arrays.toString(arr);
    
    //작은 절대편차 선언하기
    int min = Math.abs(Math.min(arr[0]-arr[1], arr[1]-arr[0]));
    
    //가장 작은 절대편차 잦기 -> 절대편차이기때문에 arr[i]-arr[j], arr[j]-arr[i]를 비교할 필요가 없었다, sol2처럼 하면 됨
    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        min =  Math.abs(Math.min(arr[i]-arr[j], arr[j]-arr[i])) < min ? Math.abs(Math.min(arr[i]-arr[j], arr[j]-arr[i])) : min;
      }
    }

    return min;
    */
    //
    //sol2
    Arrays.sort(arr);
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length-1; i++)
    {
      int currentMin = Math.abs(arr[i]-arr[i+1]);
      min = Math.min(min, currentMin);
    }
    return min;

  }

  public static void main(String[] args) {
    System.out.println(minimumAbsoluteDifference(new int[]{-2,2,4})+", ans: 2");
  }
}
