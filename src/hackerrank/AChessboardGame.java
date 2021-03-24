package hackerrank;

public class AChessboardGame {
// https://www.hackerrank.com/challenges/a-chessboard-game-1/forum/comments/290655
  static String chessboardGame(int t, int x, int y) {
    // 체스게임을 하는 플레이어 2명 중의 승자를 리턴하는 문제
    // 아래 4가지 규칙으로만 이동이 가능하고 더이상 이동할 수 없는 플레이어가 지게된다.
    // 1. (x-2, y+1)
    // 2. (x-2, y-1)
    // 3. (x+1, y-2)
    // 4. (x-1, y-2)
/* 15X15체스판에서 플레이어1이 이길 수 있는 칸과 플레이어2가 이길 수 있는 칸을 작성하면 아래와 같다.
*
2211 2211 2211 221
2211 2211 2211 221
1111 1111 1111 111
1111 1111 1111 111

2211 2211 2211 221
2211 2211 2211 221
1111 1111 1111 111
1111 1111 1111 111

2211 2211 2211 221
2211 2211 2211 221
1111 1111 1111 111
1111 1111 1111 111

2211 2211 2211 221
2211 2211 2211 221
1111 1111 1111 111
* */

    for(int i=0; i<t; i++){
      if ((x % 4 == 1 || x % 4 == 2) && (y % 4 == 1 || y % 4 == 2)) {
        return "Second";
      }
    }
    return "First";
  }

  public static void main(String[] args) {
    System.out.println(chessboardGame(3,5, 2) + ", ans: Second"); //3 1  3 3
    System.out.println(chessboardGame(3,5, 3) + ", ans: First");
    System.out.println(chessboardGame(3,8, 8) + ", ans: First");
    System.out.println(chessboardGame(3,7, 3) + ", ans: First");
    System.out.println(chessboardGame(3,8, 12) + ", ans: First");
    System.out.println(chessboardGame(3,9, 7) + ", ans: First");
  }

}
