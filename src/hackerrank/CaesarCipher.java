package hackerrank;

public class CaesarCipher {

  static String caesarCipher(String s, int k) {

    StringBuffer result = new StringBuffer();

    for (int i = 0; i < s.length(); i++) {
        //대문자
      if (Character.isUpperCase(s.charAt(i))) {
        char ch = (char) (((int) s.charAt(i) + k - 65) % 26 + 65);
        result.append(ch);
        //소문자
      } else if(Character.isLowerCase(s.charAt(i))) {
        char ch = (char) (((int) s.charAt(i) + k - 97) % 26 + 97);
        result.append(ch);
        //기타 특수문자등
      } else {
        result.append(s.charAt(i));
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    System.out.println(caesarCipher("a-z", 2) + ", ans: c-b");
    //System.out.println(caesarCipher("middle-Outz", 2) + ", ans: okffng-Qwvb");
    //System.out.println(caesarCipher("Hello_World!", 4) + ", ans: Lipps_Asvph!");
    //System.out.println(caesarCipher("www.abc.xy", 87) + ", ans: fff.jkl.gh");
  }
}
