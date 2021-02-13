package hackerrank;

public class NumberLineJumps {

  static String kangaroo(int x1, int v1, int x2, int v2) {
    //sol1
    //while문 사용
    //각각 몇 번 누적합을 했는지 횟수를 세기위해 idx1, idx2변수를 두고 1씩 증가시켰다.
    //x1이 x2보다 커지면 따라잡을 수 없으니 while문 종료
    /*
    int idx1 = 0;
    int idx2 = 0;

    while(x1 <= x2){
      if(idx1 == idx2 && x1 == x2) return "YES";
      x1 += v1;
      idx1++;
      x2 += v2;
      idx2++;
    }

    return "NO";
    */

    //sol2 : while 조건을 무한 반복
    while (true) {
      if (v1 <= v2) {
        return "NO";
      }
      x1 += v1;
      x2 += v2;
      if (x1 == x2) return "YES";
      if (x1 > x2) return "NO";
    }
  }

  public static void main(String[] args) {
    System.out.println(kangaroo(0, 3, 4, 2) + ", ans: YES");
    System.out.println(kangaroo(0, 2, 5, 3) + ", ans: NO");

  }
}
