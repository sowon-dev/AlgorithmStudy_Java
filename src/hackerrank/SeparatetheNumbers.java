package hackerrank;

import java.util.Arrays;

public class SeparatetheNumbers {

  static void separateNumbers(String s) {
    //아래 제약사항을 충족하면 YES와 가장 작은 숫자를 리턴, 충족하지않으면 NO를 리턴한다.
    //1. 다음요소는 이전요소보다 항상 1이 더 커야한다.
    //2. 요소는 0로 시작해서는 안 된다.
    //3. s안의 시퀀스를 재배열할 수 없다.

    String subStr = "";
    boolean isVaild = false;

    //subString을 0부터 시작하니까 i는 1부터 시작하고 s 길이의 반을 넘을 수 없다.
    for (int i = 1; i <= s.length() / 2; i++) {
      subStr = s.substring(0, i);
      Long num = Long.parseLong(subStr);

      //0부터 i까지 자른 String을 vaildStr변수에 담고 vaildStr를 1씩증가시킨값을 누적합한다.
      String vaildStr = subStr;
      while (vaildStr.length() < s.length()) {
        vaildStr += Long.toString(++num);
      }

      //누적합한 vaildStr과 s를 비교하여 일치하면 isVaild= true바꿔주고
      // 가장 작은 숫자를 리턴해야하기때문에 for문을 바로 종료한다.
      if (s.equals(vaildStr)) {
        isVaild = true;
        break;
      }
    }
    System.out.println(isVaild ? "YES " + subStr : "NO");
  }

  public static void main(String[] args) {
    /*
    separateNumbers("1234");
    System.out.print("ans: YES 1\n");
    separateNumbers("91011");
    System.out.print("ans: YES 9\n");
    */
    separateNumbers("99100");
    System.out.print("ans: YES 99\n");
    separateNumbers("101103");
    System.out.print("ans: NO \n");
    separateNumbers("010203");
    System.out.print("ans: NO \n");
    separateNumbers("13");
    System.out.print("ans: NO \n");
    separateNumbers("1");
    System.out.print("ans: NO \n");
  }
}
