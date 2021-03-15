package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyInteger {

  static int lonelyinteger(int[] a) {
    // 반복되지 않는 요소 찾아서 출력하는 문제

    //sol1 -> Time limit exceeded
    /*
    if(a.length == 1) return a[0];

    //배열 a 정렬하기
    Arrays.sort(a);

    //배열 a를 리스트에 담기
    List<Integer> alist = new ArrayList<>(a.length);

    for(int i : a){
      alist.add(i);
    }

    //오름차순 정렬된 리스트에서 i번째와 i+1번째가 같으면 둘 다 리스트에서 제거.
    int i=0;
    while(alist.size() != 1){
      if(alist.get(i) == alist.get(i+1)){
        alist.remove(i);
        alist.remove(i);
      }
    }

    //리턴타입이 int니까 0번째 출력
    return alist.get(0);
    */

    //sol2
    if (a.length == 1) {
      return a[0];
    }

    //배열 a 정렬하기
    Arrays.sort(a);

    int ans = 0;
    for (int i = 1; i < a.length; i++) {
      //오름차순 정렬을 했기때문에 앞의 모든 숫자가 2개씩 존재한다면 답은 제일 마지막 요소이다.
      if (i == a.length - 1) {
        ans = a[i];
        //오른차순 정렬을 했기때문에 현재요소의 왼쪽 요소와 오른쪽 요소가 현재요소와 다르다면 그 값이 답이다.
      } else if ((a[i] != a[i - 1]) && (a[i] != a[i + 1])) {
        ans = a[i];
        break;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(lonelyinteger(new int[]{1,2,3,4,3,2,1})+", ans: 4");
//    System.out.println(lonelyinteger(new int[]{1})+", ans: 1");
//    System.out.println(lonelyinteger(new int[]{1,1,2})+", ans: 2");
//    System.out.println(lonelyinteger(new int[]{0, 0, 1, 2, 1}) + ", ans: 2");
//    System.out.println(lonelyinteger(
//        new int[]{59, 88, 14, 8, 85, 1, 94, 74, 57, 96, 39, 2, 47, 43, 35, 17, 53, 52, 92, 31,
//            99, 48, 94, 30, 92, 60, 32, 45, 88, 13, 39, 50, 22, 65, 89, 46, 65, 76, 57, 67, 99, 35,
//            76, 46, 85, 82, 45, 62, 53, 80, 74, 22,
//            31, 52, 82, 13, 41, 96, 2, 1, 80, 62, 4, 20, 50, 89, 59, 67, 60, 8, 41, 14, 47, 48, 17,
//            4, 43, 30, 32}) + ", ans: 20");
  }
}
