package hackerrank;

import java.util.Arrays;

public class GridChallenge {

  static String gridChallenge(String[] grid) {
    // 그리드의 열이 사전순 정렬이면 YES를 출력하는 문제
    // 단, 그리드의 행은 순서를 변경할 수 있다.

    // 1. 행을 사전순 정렬하기
    // String을 char로 변환하여 사전순으로 sort한 후 다시 grid[i]번째에 넣는다.
//    System.out.println(Arrays.toString(grid));
    for (int i = 0; i < grid.length; i++) {
      char[] chars = grid[i].toCharArray();
      Arrays.sort(chars);
      grid[i] = String.valueOf(chars);
    }
//    System.out.println(Arrays.toString(grid));

    // 2. 열이 사전순 정렬인지 확인하기
    // 지금 열과 다음 열의 i번째를 비교하여 사전순이 아니면 NO를 출력
    for (int i = 0; i < grid[0].length(); i++) {
      for (int j = 0; j < grid.length - 1; j++) {
//        System.out.println(grid[j].charAt(i)+", "+grid[j + 1].charAt(i));
        if (grid[j].charAt(i) > grid[j + 1].charAt(i)) {
          return "NO";
        }
      }
    }
    return "YES";
  }

  public static void main(String[] args) {
    System.out.println(gridChallenge(new String[]{"abc", "ade", "efg"}) + ", ans:YES");
//    System.out.println(gridChallenge(new String[]{"ebacd", "fghij", "olmkn", "trpqs", "xywuv"}) + ", ans:YES");
//    System.out.println(gridChallenge(new String[]{"kc", "iu"}) + ", ans:YES");
    System.out.println(gridChallenge(new String[]{"uxf", "vof", "hmp"}) + ", ans:NO");
//    System.out.println(gridChallenge(new String[]{"ppp", "ypp", "wyw"}) + ", ans:YES");
//    System.out.println(gridChallenge(new String[]{"eibjbwsp", "ptfxehaq", "jxipvfga", "rkefiyub", "nflvjznh"}) + ", ans:NO");
//    System.out.println(gridChallenge(new String[]{"kalwfhfj", "lktajiaq", "srdgoros"}) + ", ans:YES");
  }
}
