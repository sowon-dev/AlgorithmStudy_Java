package leetcodeEasyLevel;

public class _0125ValidPalindrome {
  public static boolean isPalindrome(String s) {
    //sol1. => Runtime 24ms Memory 40MB
    //정규식으로 알파벳이 아닌 것들을 없앤다
    String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(s1);

    //반으로 나눈뒤 글자가 일치하는 지 확인한다.
    for(int i=0; i<s1.length()/2; i++){
      if(s1.charAt(i) != s1.charAt(s1.length()-i-1)){
        return false;
      }
    }
    return true;

    //sol2 => Runtime 39 ms Memory 40.4 MB
    //one line solution
    //https://leetcode.com/problems/valid-palindrome/discuss/1008365/Frankenstein's-Function-One-Line-Java-Solution
    /*
    return new StringBuilder().append(s).reverse().toString()
        .replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
        .equals(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()) ? true: false;
    */
  }

  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama!!"; //=> t
              //"race a car" //=> f
    System.out.println(isPalindrome(s));
  }
}
