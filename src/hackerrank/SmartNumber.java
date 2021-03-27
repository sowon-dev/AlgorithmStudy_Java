package hackerrank;

public class SmartNumber {
  public static boolean isSmartNumber(int num) {
    // 주어진 수의 제곱근의 갯수가 홀수면 YES, 짝수면 NO를 출력하는 문제
    // 조건: 주어진 코드중 한 줄만 바꿀 것
    int val = (int) Math.sqrt(num);
    if(val*val == num)
      return true;
    return false;
  }

  public static void main(String[] args) {
    System.out.println(isSmartNumber(1)+", true=Yes=홀수");
    System.out.println(isSmartNumber(2)+", false=NO=짝수");
    System.out.println(isSmartNumber(7)+", false=NO=짝수");
    System.out.println(isSmartNumber(9)+", true=YES=홀수");
    System.out.println(isSmartNumber(169)+", true=YES=홀수");
  }
}
