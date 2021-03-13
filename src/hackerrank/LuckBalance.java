package hackerrank;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LuckBalance {
  static int luckBalance(int k, int[][] contests) {
    //최대 행운이 얼마인지 구하는 문제
    Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    int max = 0;

    for(int i=0; i<contests.length; i++){
      if(contests[i][1] == 1){
        q.add(contests[i][0]);
      }else {
        max += contests[i][0];
      }
    }

    int i=0;
    while(!q.isEmpty()) {
      if(i < k) {
        max += q.poll();
      }else {
        max -= q.poll();
      }
      i++;
    }
    return max;
  }

  public static void main(String[] args) {
    int[][] contests = {{5,1,4}, {1,2,0}};
    System.out.println(luckBalance(2, contests)+", ans: 8");
  }
}
