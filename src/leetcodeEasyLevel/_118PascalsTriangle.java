package leetcodeEasyLevel;

import java.util.ArrayList;
import java.util.List;

public class _118PascalsTriangle {

  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    for (int i = 0; i < numRows; i++) {
      List<Integer> li = new ArrayList<Integer>();
      if (i == 0) {
        li.add(1);
      } else if (i == 1) {
        li.add(1);
        li.add(1);
      } else { //1과 0이 아닌 다른 숫자인 경우
        List<Integer> lp = list.get(i - 1);
        for (int k = 0; k < i; k++) {
          if (k == 0) {
            li.add(1);
          } else {
            li.add(lp.get(k - 1) + lp.get(k));
          }
        }
        li.add(1);
      }
      list.add(li);
    }
    return list;
  }

  public static void main(String[] args) {
    System.out.println(generate(5));
  }
}
