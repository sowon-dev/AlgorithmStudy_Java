package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ComparetheTriplets {
  // Complete the compareTriplets function below.
  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int cntA = 1;
    int cntB = 1;
    List<Integer> ans = new ArrayList<>(Arrays.asList(0,0));
    for(int i=0; i<a.size(); i++){
      if(a.get(i) > b.get(i)){
        ans.set(0, cntA++);
        //cntA++;
      }else if(a.get(i) < b.get(i)){
        ans.set(1, cntB++);
        //cntB++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {

    List<Integer> l1 = new ArrayList<>(Arrays.asList(17,28,30));
    List<Integer> l2 = new ArrayList<>(Arrays.asList(99,16,8));
    List<Integer> l3 = new ArrayList<>(Arrays.asList(5,6,7));
    List<Integer> l4 = new ArrayList<>(Arrays.asList(3,6,10));
    List<Integer> l5 = new ArrayList<>(Arrays.asList(1,2,3));
    List<Integer> l6 = new ArrayList<>(Arrays.asList(1,2,3));
    System.out.println(compareTriplets(l1, l2)+", ans: 2 1");
    System.out.println(compareTriplets(l3, l4)+", ans: 1 1");
    System.out.println(compareTriplets(l5, l6)+", ans: 0 0");
  }
}
