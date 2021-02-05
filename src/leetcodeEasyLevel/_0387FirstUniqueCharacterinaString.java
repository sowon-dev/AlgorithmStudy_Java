package leetcodeEasyLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0387FirstUniqueCharacterinaString {

  public static int firstUniqChar(String s) {
    //sol1. Runtime 262 ms Memory 42.6 MB
    /*
    if(s.length() == 0) return -1;

    String[] cArray = s.split("");
    List<String> ansList = new ArrayList<>();
    List<String> removedList = new ArrayList<>();
    for (String c : cArray) {
      if (!ansList.contains(c) && !removedList.contains(c)) {
        ansList.add(c);
      } else {
        ansList.remove(c);
        removedList.add(c);
      }
      //System.out.println("c: "+c+", ansList:"+ansList.toString()+", removedList: "+removedList.toString());
    }
    if (ansList.size() == 0) {
      return -1;
    }
    return s.indexOf(ansList.get(0));
*/
    //sol2. Runtime 5 ms Memory 39.3 MB
    if(s.length()==1)return 0;
    int [] alpha=new int[26]; // to count how many time find char
    for(char x : s.toCharArray()) {
      alpha[x-97]++;
      System.out.println(x+", x-97: "+(x-97)+", alpha: "+alpha[x-97]);
    }
    for(int i=0;i<s.length();i++) {
      if(alpha[s.charAt(i)-97]==1)return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(firstUniqChar("leetcode")+", expected: "+0);
    //System.out.println(firstUniqChar("loveleetcode")+", expected: "+2);
    //System.out.println(firstUniqChar("")+", expected: "+-1);
    //System.out.println(firstUniqChar("aadadaad")+", expected: "+-1);
  }
}
