package leetcodeEasyLevel;

public class _0070ClimbingStairs {

  public static int climbStairs(int n) {
    int step = 0, line2 = 0, line1 = 1;
    for (int i = 0; i < n; i++) {
      step = line1 + line2;
      line2 = line1;
      line1 = step;
    }
    return step;
  }

  public static void main(String[] args) {
    //System.out.println(climbStairs(2)); //2
    System.out.println(climbStairs(3)); //3
    //System.out.println(climbStairs(4)); //5
    System.out.println(climbStairs(5)); //8
  }
}
