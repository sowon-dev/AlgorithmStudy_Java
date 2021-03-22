package hackerrank;

public class AChessboardGame {

  static String chessboardGame(int x, int y) {
    for (int i = 0; i < 2; i++) {
      if (((x - 1) / 2) % 2 == 0 && ((y - 1) / 2) % 2 == 0) {
        return "Second";
      }
    }
      return "First";
  }

  public static void main(String[] args) {
    System.out.println(chessboardGame(5, 2) + ", ans: Second");
    System.out.println(chessboardGame(5, 3) + ", ans: First");
    System.out.println(chessboardGame(8, 8) + ", ans: First");
  }

}
