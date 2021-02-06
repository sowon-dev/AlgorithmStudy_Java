package hackerrank;

public class AVeryBigSum {
  static long aVeryBigSum(int n, long[] ar) {
    long sum = 0;
    for(long l : ar){
      sum += l;
    }
    return sum;
  }

  public static void main(String[] args) {
    int n1 = 5;
    long[] ar1 = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
    System.out.println(aVeryBigSum(n1, ar1)+", ans: 5000000015");
  }
}
