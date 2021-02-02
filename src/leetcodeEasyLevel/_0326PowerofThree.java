package leetcodeEasyLevel;

public class _0326PowerofThree {
  public static boolean isPowerOfThree(int n) {
    //3의 배수인지 불리언타입으로 출력하기
    //sol1. 구글링해도 내 코드가 제일 Runtime빠른듯
    //Runtime 11 ms Memory 39.3 MB
    /*
    if(n == 0) return false;
    if(n == 1) return true;

    while(n >= 3){
      if(n == 3) return true;
      if(n%3 == 0){
        n = n/3;
      }else{
        return false;
      }
    }
    return false;
    */

    //sol2 Runtime 22 ms Memory 43.6 MB
    if(n == 0) return false;
    while(n % 3 == 0) {
      n/=3;
    }
    return n == 1;
  }

  public static void main(String[] args) {
    System.out.println(isPowerOfThree(27)+", ans: true");
    System.out.println(isPowerOfThree(0)+", ans: false");
    System.out.println(isPowerOfThree(9)+", ans: true");
    System.out.println(isPowerOfThree(45)+", ans: false");
    System.out.println(isPowerOfThree(1)+", ans: true");
    System.out.println(isPowerOfThree(3)+", ans: true");
  }
}
