package hackerrank;

public class MisereNim {

  static String misereNim(int[] s) {
    // Nim게임의 승자를 출력하는 문제
    // 두 명의 게임 참가자.
    // 차례가 올때마다 돌 1개이상을 돌무덤에서 제거하거나 돌무덤에 더할 수 있다.
    // 마지막 돌을 제거하는 참가자가 승리한다.

    int xor = 0;
    int sum = 0;

    for (int i : s) {
      xor ^= i;
      sum += i;
    }

    if (sum == s.length && s.length % 2 == 0) {
      return "First";
    } else if (sum == s.length && s.length % 2 == 1) {
      return "Second";
    } else if (xor != 0) {
      return "First";
    } else {
      return "Second";
    }
  }

  public static void main(String[] args) {
    System.out.println(misereNim(new int[]{1, 1}) + ", ans: First");
    System.out.println(misereNim(new int[]{2, 1, 3}) + ", ans: Second");
  }
}
