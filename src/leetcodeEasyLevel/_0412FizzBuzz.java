package leetcodeEasyLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0412FizzBuzz {

  public static List<String> fizzBuzz(int n) {
    //n의 약수 중 작은 약수의 배수일때는 Fizz. 큰 약수의 배수일때는 Buzz를, 두 약수의 공통배수일때는 FizzBuzz 출력하는 문제이다.
    //예를 들어 15의 약수는 3,5이다.
    //3의 배수일 때는 Fizz를, 5의 배수일때는 Buzz를, 3과5의 공통배수는 FizzBuzz 출력하기

    //Runtime 1 ms Memory 40 MB
    int tracker = 1;
    ArrayList<String> list = new ArrayList<>();
    while (tracker <= n) {
      if (tracker % 3 == 0 && tracker % 5 == 0) {
        list.add("FizzBuzz");
      } else if (tracker % 3 == 0) {
        list.add("Fizz");
      } else if (tracker % 5 == 0) {
        list.add("Buzz");
      } else {
        list.add(String.valueOf(tracker));
      }
      tracker++;
    }
    return list;
  }

  public static void main(String[] args) {
    System.out.println(fizzBuzz(15) + "\nans: [\n"
        + "    \"1\",\n"
        + "    \"2\",\n"
        + "    \"Fizz\",\n"
        + "    \"4\",\n"
        + "    \"Buzz\",\n"
        + "    \"Fizz\",\n"
        + "    \"7\",\n"
        + "    \"8\",\n"
        + "    \"Fizz\",\n"
        + "    \"Buzz\",\n"
        + "    \"11\",\n"
        + "    \"Fizz\",\n"
        + "    \"13\",\n"
        + "    \"14\",\n"
        + "    \"FizzBuzz\"\n"
        + "]");
  }
}

