package hackerrank;

import java.util.Arrays;
import java.util.Collections;

public class MarcsCakewalk {
  static long marcsCakewalk(int[] calorie) {
    //마크는 칼로리 c만큼인 컵케익 j를 행복하게 먹은 뒤 해당 칼로리를 불태우기위해 2의 j승 * c 마일만큼 걸으려고한다.
    //그가 걸어야 하는 마일수 중 가장 작은 마일수를 리턴하는 문제.

    //int[]는 Collections이 아니므로 Integer[]로 변경
    Integer[] caloriesInteger = new Integer[calorie.length];
    for(int i=0; i< calorie.length; i++){
      caloriesInteger[i] = calorie[i];
    }
    Arrays.sort(caloriesInteger, Collections.reverseOrder());
    System.out.println(Arrays.toString(caloriesInteger));
    
    //가장 작은 마일수 구하기
    long miles = 0;
    for(int i =0; i< caloriesInteger.length; i++){
      miles += Math.pow(2, i) * caloriesInteger[i];
    }

    return miles;
  }

  public static void main(String[] args) {
    int[] a = {1, 3, 2};
    int[] b = {7, 4, 9, 6};
    int[] c ={819,701,578,403,50,400,983,665,510,523,696,532,51,449,333,234,958,460,277,347,950,53,123,227,646,190,938,61,409,110,61,178,659,989,625,237,944,550,954,439};
    int[] d={801,234,536,747,172,590,833,847,509,429,666,411,609,894,348,254,814,767,647,965,711,801,852,781,972,390,218,290,508,174,55,714,442,284,745,872,46,131,833,315};
    //System.out.println(marcsCakewalk(a)+", ans: 11");
    //System.out.println(marcsCakewalk(b)+", ans: 79");
    System.out.println(marcsCakewalk(c)+", ans: 59715404338867");
    System.out.println(marcsCakewalk(d)+", ans: 84350424920174");
  }
}
