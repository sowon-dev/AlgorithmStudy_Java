package leetcodeEasyLevel;

public class _0172FactorialTrailingZeroes {
  public static int trailingZeroes(int n) {
    int count =0;
    int r=0;
    int sum=0;
    while(n>0){
      r=n%10;  //getting remainder
      sum=(sum*10)+r;
      n=n/5;
      count =count+n;
    }
    return count;
  }

  public static void main(String[] args) {
    int n = //3; //=>0
           5;//=>1
          // 0; //=>0
    System.out.println(trailingZeroes(n));
  }
}
