package hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

  static int minimumNumber(int n, String password) {
    // 조건에 맞는 6자리 이상의 비번이 되기위해서 필요한 자리수를 출력하는 문제

    //sol1
    /*
    String numbers = "0123456789";
    String lower_case = "abcdefghijklmnopqrstuvwxyz";
    String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String special_characters = "!@#$%^&*()-+";

    //각각 조건을 boolean형태로 정의
    Boolean isNumbers = false;
    Boolean isLower_case = false;
    Boolean isUpper_case = false;
    Boolean isSpecial_characters = false;

    int minNum = 0;
    
    //조건이 참이면 해당 조건 값을 true로 변경
    for (String s : password.split("")) {
      if(numbers.contains(s)) isNumbers = true; 
      if(lower_case.contains(s)) isLower_case = true;
      if(upper_case.contains(s)) isUpper_case = true;
      if(special_characters.contains(s)) isSpecial_characters = true;
    }
    
    //각 조건이 true가 아니면 필요한 자리수 1증가
    if(!isNumbers) minNum++;
    if(!isLower_case) minNum++;
    if(!isUpper_case) minNum++;
    if(!isSpecial_characters) minNum++;

    return minNum < 6 - n ? 6 - n : minNum;
    */

    //sol2 정규식사용
    int minNum = 0;

    Pattern numbers = Pattern.compile("[0-9]");
    Matcher m = numbers.matcher(password);
    if(!m.find()) minNum++;

    Pattern lower_case = Pattern.compile("[a-z]");
    m = lower_case.matcher(password);
    if(!m.find()) minNum++;

    Pattern upper_case = Pattern.compile("[A-Z]");
    m = upper_case.matcher(password);
    if(!m.find()) minNum++;

    Pattern special_characters = Pattern.compile("[!@#$%^&*()\\-+]");
    m = special_characters.matcher(password);
    if(!m.find()) minNum++;

    return 6 > minNum + n ? 6 - n : minNum;
  }

  public static void main(String[] args) {
    System.out.println(minimumNumber(3, "Ab1") + ", ans: 3");
    System.out.println(minimumNumber(4, "Ab1!") + ", ans: 2");
    System.out.println(minimumNumber(6, "Ab1!12") + ", ans: 0");
    System.out.println(minimumNumber(11, "#HackearRnk") + ", ans: 1");
    System.out.println(minimumNumber(4, "4700") + ", ans: 3");
    System.out.println(minimumNumber(4, "IGEC") + ", ans: 3");
  }
}
