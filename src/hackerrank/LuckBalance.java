package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {

  static int luckBalance(int k, int[][] contests) {
    // contests에서 각 대회가 중요하면 1이고 중요하지 않으면 0이다.
    // k는 중요한 대회에서 질 수 있는 횟수이다.
    // contests에서 지면 행운이 높아지고 이기면 행운이 낮아진다.
    // k만큼질때의 최대 행운이 얼마인지 구하는 문제
    int maxLuck = 0;
    int important = 0;

    List<Integer> luckList = new ArrayList<>();
    for (int i = 0; i < contests.length; i++) {
      if (contests[i][1] == 1) { //중요한 대회면 luckList에 담기
        important++;
        luckList.add(contests[i][0]);
      } else { //중요하지 않은 대회들은 바로 maxLuck에 누적합
        maxLuck += contests[i][0];
      }
    }

    //중요한대회만 luckList 오름차순으로 정렬
    Collections.sort(luckList);
//    System.out.println("luckList: " + luckList);

    //가장 낮은 행운을 가진 대회 maxLuck에서 빼준다.
    int ableToLose = important - k;
    for (int i = 0; i < ableToLose; i++) {
      maxLuck -= luckList.remove(0); //가장 낮은 행운 빼기
    }
//    System.out.println("luckList: " + luckList + " , ableToLose: " + ableToLose);

    //가장 높은 행운을 가진 대회를 maxLuck에 더해준다.
    for (int i = 0; i < luckList.size(); i++) {
      maxLuck += luckList.get(i);
    }

    return maxLuck;
  }

  public static void main(String[] args) {
    int[][] contests1 = {{5, 1}, {1, 1}, {4, 0}};
    int[][] contests2 = {{5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}};
    System.out.println(luckBalance(2, contests1) + ", ans: 10");
    System.out.println(luckBalance(1, contests1) + ", ans: 8");
    System.out.println(luckBalance(3, contests2) + ", ans: 29");
  }
}
