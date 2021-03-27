package hackerrank;

public class IntroductiontoNimGame {

  static String nimGame(int[] pile) {
    // Nim게임의 승자를 출력하는 문제
    // 두 명의 게임 참가자.
    // 차례가 올때마다 돌 1개이상을 돌무덤에서 제거한다.
    // 마지막 돌을 제거하는 참가자가 승리한다.

    // XOR란 이진법으로 두 요소가 같으면 0, 다르면 1를 출력한다.
    int nim_sum = 0;
    for(int i=0; i<pile.length; i++){
      nim_sum = nim_sum ^ pile[i];
    }
    if(nim_sum == 0) return "Second";
    return "First";
  }

  public static void main(String[] args) {
    System.out.println(nimGame(new int[]{1, 1}) + ", ans:Second");
    System.out.println(nimGame(new int[]{2, 1, 4}) + ", ans:First");
  }
}
