package leetcodeEasyLevel;

public class _0172FactorialTrailingZeroes {
  public static int trailingZeroes(int n) {
    //https://www.youtube.com/watch?v=rrrbC6XdLBk&feature=emb_logo
    int result = 0;
    while( n > 0 ){
      n = n/5;
      result += n;
    }
    return result;
  }

  public static void main(String[] args) {
    int n = //3; //=>0
          // 5;//=>1
          // 0; //=>0
          25; //=>6
    System.out.println(trailingZeroes(n));
  }
}
