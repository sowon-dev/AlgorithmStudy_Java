package leetcodeEasyLevel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _0242ValidAnagram {
  public static boolean isAnagram(String s, String t) {
    //Anagram 애너그램 : 철자를 바꾼 어구

    //sol1. Change to char array and check every char is the same
    //Runtime 2 ms Memory 39.5 MB
    /*
    char[] split_s = s.toCharArray();
    char[] split_t = t.toCharArray();
    Arrays.sort(split_s);
    Arrays.sort(split_t);

    if(split_s.length != split_t.length) return false;

    for(int i=0; i<split_s.length; i++){
      if(split_s[i] != split_t[i]) {
        return false;
      }
    }
    return true;
    */

    //sol2 : Use Arrays.equals() instead of for loop
    //Runtime 2 ms Memory 39.7 MB
    /*
    if (s.length() != t.length()) {
      return false;
    }
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    return Arrays.equals(str1, str2);
    */

    //sol3 : use number of char
    // Runtime 2 ms Memory 39.5 MB
    int arr[] = new int[26];
    for(char c : s.toCharArray()){
      arr[c-'a']++;
    }

    for(char c : t.toCharArray()){
      if(arr[c-'a'] == 0){
        return false;
      }
      arr[c-'a']--;
    }

    for(int i=0;i<26;i++){
      if(arr[i]>0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isAnagram("anagram","nagaram")); //=>true
    System.out.println(isAnagram("rat","car")); //=>false
  }

}
