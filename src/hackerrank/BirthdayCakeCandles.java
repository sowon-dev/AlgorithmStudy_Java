package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

  static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int cnt = 0;
    Collections.sort(candles);

    for(int i=0; i<candles.size(); i++){
      int maxNum = candles.get(candles.size() - 1);
      if(candles.get(i) >= maxNum){
        cnt ++;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    List<Integer> candles1 = new ArrayList<>(Arrays.asList(4, 4, 1, 3));
    List<Integer> candles2 = new ArrayList<>(Arrays.asList(3, 2, 1, 3));
    System.out.println(birthdayCakeCandles(candles1) + ", ans: 2");
    System.out.println(birthdayCakeCandles(candles2) + ", ans: 2");
  }
}
