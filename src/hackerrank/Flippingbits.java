package hackerrank;

public class Flippingbits {
  static long flippingBits(long n) {
    String stbinary ="";
    
    //32자리를 만들고 2진수로 표현한 n을 32자리에 넣는다. 이때 자리수에 숫자가 없으면 0을 넣는다.
    String convertString = String.format("%32s", Long.toBinaryString(n)).replace(' ', '0');
    
    //앞자리부터 0이면 1을, 1이면 0을 추가한다.
    for (int i = 0; i < convertString.length(); i++) {
      if (convertString.charAt(i) == '0') {
        stbinary = stbinary + "1";
      } else {
        stbinary = stbinary + "0";
      }
    }

    //String을 2진법으로 long으로 바꾼다.
    return Long.parseLong((stbinary), 2);
  }

  public static void main(String[] args) {
//    System.out.println(flippingBits(2147483647L)+", ans: 2147483648 일치? "+ (flippingBits(2147483647) == 2147483648L));
//    System.out.println(flippingBits(1)+", ans: 4294967294 일치? "+ (flippingBits(1) == 4294967294L));
//    System.out.println(flippingBits(0)+", ans: 4294967295 일치? "+ (flippingBits(0) == 4294967295L));
    System.out.println(flippingBits(4)+", ans: 4294967291 일치? "+ (flippingBits(4) == 4294967291L));
//    System.out.println(flippingBits(123456)+", ans: 4294843839 일치? "+ (flippingBits(123456) == 4294843839L));
  }
}
