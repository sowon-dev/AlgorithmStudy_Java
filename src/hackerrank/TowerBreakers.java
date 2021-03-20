package hackerrank;

public class TowerBreakers {

  static int towerBreakers(int n, int m) {
    // 아래 게임규칙을 적용하여 첫번째 플레이어가 승자면 1을, 두번째 플레이어가 승자면 2를 리턴하는 문제
    // n개의 타워가 있고 각 타워의 높이는 m이다.
    // 돌아가면서 게임을 진행하며, 플레이어는 높이x의 타워를 선택하여 길이 y만큼을 제거할 수 있다.
    // 이때 1 <= y < x이고 x%y = 0이다.

    //타워가
    if (m == 1) {
      return 2;
    }

    if (n % 2 == 0) {
      return 2;
    } else {
      return 1;
    }
  }

  public static void main(String[] args) {
    System.out.println(towerBreakers(2, 6) + ". ans: 2");
    System.out.println(towerBreakers(2, 2) + ". ans: 2");
    System.out.println(towerBreakers(1, 4) + ". ans: 1");
  }
}
