package hackerrank;

import java.util.ArrayList;
import java.util.Collections;

public class MaximizingXOR {
  static int maximizingXor(int l, int r) {
    //XOR란 어느 한쪽만이 참일 때 참이고, 둘 다 참이거나 거짓일 때 거짓이 되는 논리 연산
    //l부터 r까지의 xor논리연산을 한 값이 가장 큰 값을 리턴하는 문제
    ArrayList<Integer> arr = new ArrayList();
    int res;
    for (int i = l; i <= r; i++) {
      for (int j = l; j < r; j++) {
        res = i ^ j;
        arr.add(res);
      }
    }
    
    //논리연산한 값 오름차순으로 나열
    Collections.sort(arr);

    //오름차순임으로 가장 큰 맨 뒤의 값 출력
    res = arr.get(arr.size() - 1);
    return res;
  }

  public static void main(String[] args) {
    System.out.println(maximizingXor(11, 12)+", ans: 7");
    System.out.println(maximizingXor(10, 15)+", ans: 7");
  }

}
