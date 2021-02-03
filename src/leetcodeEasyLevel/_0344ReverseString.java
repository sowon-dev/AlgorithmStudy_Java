package leetcodeEasyLevel;

import java.util.Arrays;

public class _0344ReverseString {

  public static void reverseString(char[] s) {
    //새로운 배열을 만들지않고 char array 역순으로 출력하는 문제

    //sol1. Runtime 1 ms Memory 52.5 MB
    /*
    for (int i = 0; i < s.length / 2; i++) {
      char temp = s[i];
      s[i] = s[s.length - 1 - i]; //0 = 5, 1 = 4. 2 = 3
      s[s.length - 1 - i] = temp;
    }
    */

    //sol2 Runtime 1 ms Memory 53 MB
    int st = 0, en = s.length - 1;
    while (st < en) {
      char temp = s[st];
      s[st] = s[en];
      s[en] = temp;
      st++;
      en--;
    }

    //print the result
    System.out.println(Arrays.toString(s));
  }

  public static void main(String[] args) {
    char[] ex1 = {'h', 'e', 'l', 'l', 'o' };
    char[] ex2 = {'H', 'a', 'n', 'n', 'a', 'h' };

    reverseString(ex1);
    reverseString(ex2);
    System.out.println("ex1 ans: [\"o\",\"l\",\"l\",\"e\",\"h\"]");
    System.out.println("ex2 ans: [\"h\",\"a\",\"n\",\"n\",\"a\",\"H\"]");
  }
}
