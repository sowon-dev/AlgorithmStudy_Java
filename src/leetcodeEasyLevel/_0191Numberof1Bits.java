package leetcodeEasyLevel;

public class _0191Numberof1Bits {

  public static int hammingWeight(int n) {
    //sol1 Runtime 0 ms Memory 36 MB
    // >>>n : unsigned 우측 쉬프트 연산자는 오른편으로 n칸씩이동하며 왼편에 있는 부호와 무관하게 0으로 채운다.
    int cnt = 0;
    while(n != 0){
      if((n&1)==1){
        cnt ++;
      }
      n = n>>>1;
    }

    return cnt;

    //sol2 Runtime 0 ms Memory 36 MB
    /*
    return Integer.bitCount(n);
     */
  }

  public static void main(String[] args) {
    int n = 011101110;
    System.out.println(hammingWeight(n));
  }
}

