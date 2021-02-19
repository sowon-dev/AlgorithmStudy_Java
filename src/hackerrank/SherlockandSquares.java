package hackerrank;

public class SherlockandSquares {
  static int squares(int a, int b) {
    // 주어진 수의 범위안에 제곱근(square integer)을 구하는 문제
    //sol1
    int start = (int) Math.sqrt(a);
    int end = (int) Math.sqrt(b);

    start = (Math.pow(start, 2) >= a) ? start-1 : start;

    return end - start;

    //sol2. one line code
//		return (int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1;
  }

  public static void main(String[] args) {
    System.out.println(squares(24, 49) + ", ans: 3");
    System.out.println(squares(3, 9) + ", ans: 2");
    System.out.println(squares(17, 24) + ", ans: 0");
    System.out.println(squares(100, 1000) + ", ans: 22");
    System.out.println(squares(9, 16) + ", ans: 2");
    System.out.println(squares(11, 734) + ", ans: 24");
    System.out.println(squares(228, 919) + ", ans: 15");
    System.out.println(squares(71, 188) + ", ans: 5"); //9 10 11 12 13
    System.out.println(squares(270, 303) + ", ans: 1");
    System.out.println(squares(312, 701) + ", ans: 9");
    System.out.println(squares(251, 325) + ", ans: 3");
    System.out.println(squares(418, 954) + ", ans: 10");
    System.out.println(squares(407, 597) + ", ans: 4");
    System.out.println(squares(4, 4) + ", ans: 1");
  }

}
