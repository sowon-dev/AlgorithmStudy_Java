package leetcodeEasyLevel;

public class _0204countPrimes {

  //prime numbers 즉 소수를 찾는 문제
  public static int countPrimes(int n) {
    boolean[] nums = new boolean[n];
    int primeCount = 0;
    // 1부터 n까지의 숫자를 true로 초기화한다.
    for (int i = 0; i < n; i++) {
      nums[i] = true;
    }

    //제곱이 가능한 숫자는 false로 변경한다.
    for (int i = 2; i * i < n; i++) {
      //false를 true 바꾸지 않도록 조건을 건다.
      if (nums[i] == true) {
        //배수들은 다 false로 변경한다.
        for (int j = 2; j * i < n; j++) {
          nums[j * i] = false;
        }
      }
    }

    //true만 세기
    for (int i = 2; i < n; i++) {
      if (nums[i] == true) {
        primeCount++;
      }
    }
    return primeCount;
  }

  public static void main(String[] args) {
    int n = 10; //=> 4
    System.out.println(countPrimes(n));
  }
}
