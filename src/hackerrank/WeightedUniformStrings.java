package hackerrank;

import java.util.HashSet;
import java.util.Set;

public class WeightedUniformStrings {

  static String[] weightedUniformStrings(String s, int[] queries) {

    int[] charsWeight = new int[26];
    for(int i=0; i<26; i++){
      charsWeight[i] = i + 1;
    }

    int currentChar = s.charAt(0);
    int currentWeight = charsWeight[currentChar - 'a'];
    Set<Integer> allWeights = new HashSet<Integer>();
    allWeights.add(currentWeight);
    for(int i=1; i<s.length(); i++){
      currentChar = s.charAt(i);
      char prevChar = s.charAt(i-1);
      allWeights.add(charsWeight[currentChar -'a']);

      if(prevChar == currentChar){
        currentWeight += charsWeight[currentChar - 'a'];
      } else {
        currentWeight = charsWeight[currentChar - 'a'];
      }

      allWeights.add(currentWeight);
    }

    String[] result = new String[queries.length];
    for(int i=0; i<queries.length; i++){
      if(allWeights.contains(queries[i])){
        result[i] = "Yes";
      }else {
        result[i] = "No";
      }
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(weightedUniformStrings("abccddde", new int[]{6, 1, 3, 12, 5, 9, 10}));
  }
}
