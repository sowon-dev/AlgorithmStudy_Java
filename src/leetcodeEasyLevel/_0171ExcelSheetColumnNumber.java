package leetcodeEasyLevel;

public class _0171ExcelSheetColumnNumber {
  // https://leetcode.com/problems/excel-sheet-column-number/discuss/1017323/Java-100-Faster-Explanation
  public static int titleToNumber(String s) {
    int sum = 0; int temp = 0;
    for(int i=s.length()-1; i>=0; i--){
      sum += Math.pow(26, temp++)*(s.charAt(i)-'A'+1);
    }
    return sum;
  }

  public static void main(String[] args) {
    String s = //"A"; //=>1
              // "AB"; //=>28
               "ZY"; //=>701
    System.out.println(titleToNumber(s));
  }
}
