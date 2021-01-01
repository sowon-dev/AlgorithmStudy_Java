package leetcodeEasyLevel;

public class _0070ClimbingStairs {

  public static int climbStairs(int n) {
    //sol 1 => Runtime: 0 ms, Memory: 35.9 MB

    int[] arr = new int[n];
    if (n == 0 || n == 1 || n == 2) {
      return n;
    }

    arr[0] = 1; //1일땐 1
    arr[1] = 2; //2일땐 2

    for (int i = 2; i < n; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
      System.out.printf("n: %d, arr[%d]: %d = arr[%d]: %d + arr[%d]: %d, arr[%d]:%d \n", n, i, arr[i],
              i - 1, arr[i - 1], i - 2, arr[i - 2], n - 1, arr[n - 1]);
    }
    return arr[n - 1];


    //sol 2 => Runtime: 0 ms, Memory: 36.1 MB
    /*
    int step = 0, line0 = 0, line1 = 1;
    for (int i = 0; i < n; i++) {
      step = line1 + line0;
      line0 = line1;
      line1 = step;
      System.out.printf("n: %d, i: %d, step: %d, line0: %d, line1: %d \n", n, i, step, line0, line1);
    }
    return step;
     */

    //sol 3 => Time Limit Exceeded
    /*
    if( n<= 2){ //0: 0; 1:1; 2:2
      return n;
    }else{
      return climbStairs(n-1) + climbStairs(n-2);
    }
    */
  }

  public static void main(String[] args) {
    //System.out.println(climbStairs(2)); //2
    System.out.println(climbStairs(3)); //3
    System.out.println(climbStairs(4)); //5
    System.out.println(climbStairs(5)); //8
  }
}
