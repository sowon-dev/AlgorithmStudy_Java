package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    // https://www.youtube.com/watch?v=gtvE0vxuvy8
    int cnt = 0;
    int current = a.get(a.size() - 1);
    int flag; //a가 current의 약수가 아니거나 b가 current의 배수가 아닌 경우 flag 1 대입 후 break -> current를 1 더해준 뒤 다시 while문 반복 실행

    while (current <= b.get(0)) {
      flag = 0;

      //a 요소가 current의 약수면 flag=0 유지
      for (int i : a) {
        if (current % i != 0) {
          flag = 1;
          break;
        }
      }

      //b 요소가 current의 배수면 flag=0 유지
      if (flag == 0) {
        for (int i : b) {
          if (i % current != 0) {
            flag = 1;
            break;
          }
        }
      }

      //위의 두 for문이 참이면 cnt 1씩 증가
      if (flag == 0) {
        cnt++;
      }

      System.out.printf("cnt: %d, current: %d, flag: %d%n", cnt, current, flag);
      current++;
    }
    return cnt;
  }

  public static void main(String[] args) {
    System.out.println(getTotalX(new ArrayList<>(Arrays.asList(2, 6)), new ArrayList<>(Arrays.asList(24, 36))) + ", ans: 2");
    System.out.println(getTotalX(new ArrayList<>(Arrays.asList(2, 4)), new ArrayList<>(Arrays.asList(16, 32, 96))) + ", ans: 3");
  }
}