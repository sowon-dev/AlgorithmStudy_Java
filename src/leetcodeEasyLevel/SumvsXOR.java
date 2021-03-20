package leetcodeEasyLevel;

public class SumvsXOR {

  static long sumXor(long n) {
    //이진수의 논리연산
    //sol1 => Time limit exceeded
    /*
    long cnt = 0;
    for (int i = 0; i <= n; i++) {
      if ( (n + i) == (n ^ i)) {
        cnt++;
      }
    }
    return cnt;
     */

    //sol2
    long count = 0;
    //10진법의 짝수인 경우 2진법에서 마지막 비트가 0이다. count에 1증가시킨다.
    //This performs a basic conversion from int to binary using divide by two and checking even or odd
    while(n != 0){
      count += (n%2 == 0)? 1:0;
      n/=2;
    }

    // Math.pow(a,b)는 a의 b승
    count = (long) Math.pow(2,count);
    return count;
  }
  /* (10진법) 4 => (2진법) 100
  * 0 =>  0
  * 1 => 101 = 5
  * 2 => 110 = 6
  * 3 => 111 = 7
  * */

  public static void main(String[] args) {
    long n;
    System.out.println(sumXor(4) + ", ans: 4");
    System.out.println(sumXor(5) + ", ans: 2");
    n = 1000000000000000L;
    System.out.println(sumXor(n) + ", ans: 1073741824");
    n = 3434444444333L;
    System.out.println(sumXor(n) + ", ans: 262144");
  }
}
