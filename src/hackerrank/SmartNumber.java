package hackerrank;

public class SmartNumber {
  public static boolean isSmartNumber(int num) {
    int val = (int) Math.sqrt(num);
    if(num / val == 1)
      return true;
    return false;
  }

  public static void main(String[] args) {
    System.out.println(isSmartNumber(4));
  }
}
