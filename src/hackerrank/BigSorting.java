package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {

  static String[] bigSorting(String[] unsorted) {
    //String 타입의 정렬안된 배열을 숫자오름차순으로 숫자를 정렬하는 문제.

    //첫시도 -실패-> Exception in thread "main" java.lang.NumberFormatException: For input string: "31415926535897932384626433832795"
    /*
    //String arr를 long arr로 바꾼다.
    long[] arr = new long[unsorted.length];

    for (int i = 0; i < unsorted.length; i++) {
      arr[i] = Long.parseLong(unsorted[i]);
    }

    //long 배열을 오름차순정렬한다.
    Arrays.sort(arr);

    //정렬한 long배열을 String 배열로 바꾼 뒤 리턴한다.
    String[] result = new String[unsorted.length];
    for (int i = 0; i < unsorted.length; i++) {
      result[i] = Long.toString(arr[i]);
    }
    System.out.println(Arrays.toString(result));
    return result;
    */

    //sol4 람다식 + sort
//    System.out.println(Arrays.toString(unsorted));
    Arrays.sort(unsorted, (x, y) -> {
//      System.out.print("시작 arr: "+Arrays.toString(unsorted) + "   x: "+x+"   y:"+y);
      if (x.length() == y.length()) {
//        System.out.print("    x.compareTo(y): "+x.compareTo(y)+"\n");
        return x.compareTo(y); //자리수에 상관없이 첫째자리만 보고 오름차순 정렬
      }else {
//        System.out.print("     x.length() - y.length(): "+ (x.length() - y.length()) +"\n");
        return x.length() - y.length(); //자리수에 상관한 오름차순 정렬
      }
    });

    return unsorted;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.next();

    }
    arr = bigSorting(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    sc.close();
/* sample input
6
31415926535897932384626433832795
1
3
10
3
5
*/
  }
}
