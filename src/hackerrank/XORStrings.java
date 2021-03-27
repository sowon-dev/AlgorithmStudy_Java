package hackerrank;

public class XORStrings {
  public static String stringsXOR(String s, String t) {
    // 0과 1로된 두 개의 문자열에서 XOR값을 리턴하는 문제
    // XOR란 같으면 0 다르면 1을 출력한다.
    // 주어진 코드 중 3줄만 수정가능하고 새로운 코드를 추가하거나 기존 코드를 제거하면 안된다.
    String res = new String("");
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == t.charAt(i))
        res += "0";
      else
        res += "1";
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(stringsXOR("10101", "00101")+", ans: 10000");
  }
}
