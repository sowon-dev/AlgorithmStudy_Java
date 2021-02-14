package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    // https://www.youtube.com/watch?v=gtvE0vxuvy8
    int cnt = 0, current = a.get(a.size() - 1), flag;

    while (current <= b.get(0)) {
      flag = 0;
      for (int i : a) {
        if (current % i != 0) {
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        for (int i : b) {
          if (i % current != 0) {
            flag = 1;
            break;
          }
        }
      }
      if (flag == 0) {
        cnt++;
      }
      current++;
    }
    return cnt;
  }

  public static void main(String[] args) {
    System.out.println(getTotalX(new ArrayList<>(Arrays.asList(2, 6)), new ArrayList<>(Arrays.asList(24, 36))) + ", ans: 2");
    System.out.println(getTotalX(new ArrayList<>(Arrays.asList(2, 4)), new ArrayList<>(Arrays.asList(16, 32, 96))) + ", ans: 3");
  }
}