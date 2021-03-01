package hackerrank;

public class TwoCharacters {

  public static final int NUM_LETTERS = 26;

  static int alternate(int length, String s) {
    int maxPattern = 0;

    if(s.length() == 1)//Edge case where length is 1
    {
      return maxPattern;
    }

    /* Create arrays representing the 26^2 subproblems */
    int[][] pair = new int[NUM_LETTERS][NUM_LETTERS];
    int[][] count = new int[NUM_LETTERS][NUM_LETTERS];

    for (int i = 0; i < s.length(); i++) {
      char letter = s.charAt(i);
      int letterNum = letter - 'a';

      /* Update row */
      for (int col = 0; col < NUM_LETTERS; col++) {
        if (pair[letterNum][col] == letter) {
          count[letterNum][col] = -1;
        }
        if (count[letterNum][col] != -1) {
          pair[letterNum][col] = letter;
          count[letterNum][col]++;
        }
      }

      /* Update column */
      for (int row = 0; row < NUM_LETTERS; row++) {
        if (pair[row][letterNum] == letter) {
          count[row][letterNum] = -1;
        }
        if (count[row][letterNum] != -1) {
          pair[row][letterNum] = letter;
          count[row][letterNum]++;
        }
      }
    }

    /* Find max in "count" array */
    for (int row = 0; row < NUM_LETTERS; row++) {
      for (int col = 0; col < NUM_LETTERS; col++) {
        maxPattern = Math.max(maxPattern, count[row][col]);
      }
    }

    return maxPattern;
  }

  public static void main(String[] args) {
    System.out.println(alternate(10, "beabeefeab")+", ans: 5");
  }
}
