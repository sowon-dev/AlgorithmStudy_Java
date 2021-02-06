package hackerrank;

public class Staircase {

  static void staircase(int n) {
    //sol1
    for (int i = 1; i <= n; i++) {
      System.out.print(new String(new char[n - i]).replace("\0", " "));
      System.out.println(new String(new char[i]).replace("\0", "#"));
    }

    //sol2
    /*
    System.out.println("---sol2");
    int star = 1, space = n - 1;
    while (n > 0) {
      for (int i = 0; i < space; i++) {
        System.out.print(" ");
      }
      for (int i = 0; i < star; i++) {
        System.out.print("#");
      }
      star = star + 1;
      space = space - 1;
      --n;
      System.out.println("");
    }
    */

    //sol3
    System.out.println("---sol3");
    StringBuilder sb = new StringBuilder(n);
    String fmt = "%" + n + "s\n";
    for (int i = 1; i <= n; i++) {
      sb.append('#');
      System.out.printf(fmt, sb);
    }
  }

  public static void main(String[] args) {
    staircase(6);
  }
}
