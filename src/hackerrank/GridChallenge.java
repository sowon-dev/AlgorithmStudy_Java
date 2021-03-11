package hackerrank;

import java.util.Arrays;

public class GridChallenge {

  static String gridChallenge(String[] grid) {
    //그리드가 열이 오름차순 정렬이면 YES출력하는 문제

    char charArr[] = new char[grid.length];
    char copyCharArr[] = new char[grid.length];
    boolean isAscending = true;

    for (int i = 0; i < grid.length; i++) {
      //주어진 grid를 char arr로 바꾼뒤 오름차순 정렬한다.
      char[] chars = grid[i].toCharArray();
      System.out.println("char arr: "+Arrays.toString(chars));
      Arrays.sort(chars);

      //정렬된 char arr를 String arr로 만든다
      grid[i] = new String(chars);
      System.out.println("grid[i]: "+Arrays.toString(grid));

      //compareTo
      if ( i != 0 && grid[i].compareTo(grid[i-1]) < 0 )
      System.out.println("compareTo: "+ (grid[i].compareTo(grid[i-1]) < 0) );
        return "NO";
    }
    return "YES";
  }

  public static void main(String[] args) {
//    System.out.println(gridChallenge(new String[]{"abc", "ade", "efg"}) + ", ans:YES");
//    System.out.println(gridChallenge(new String[]{"ebacd", "fghij", "olmkn", "trpqs", "xywuv"}) + ", ans:YES");
    System.out.println(gridChallenge(new String[]{"kc", "iu"}) + ", ans:YES");
//    System.out.println(gridChallenge(new String[]{"uxf", "vof", "hmp"}) + ", ans:NO");
//    System.out.println(gridChallenge(new String[]{"ppp", "ypp", "wyw"}) + ", ans:YES");
  }
}
