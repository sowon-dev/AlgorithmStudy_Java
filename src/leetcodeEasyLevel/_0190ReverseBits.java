package leetcodeEasyLevel;

//How to solve :

public class _0190ReverseBits {
  // you need treat n as an unsigned value
  public static int reverseBits(int n) {
    int ret=0;
    // because there are 32 bits in total
    for (int i = 0; i <32;i++){
      //비트 이동연산자 <<n: n만큼 왼쪽으로 이동
      ret = ret<<1;
      // If the bit is 1 we OR it with 1, ie add 1
      if((n & 1) > 0){
        ret = ret | 1;
      }
      n=n>>>1;
    }
    return ret;
  }

  public static void main(String[] args) {
    String n = "00000010100101000001111010011100";
    //System.out.println(reverseBits(Integer.parseUnsignedInt(n)));
  }
}
