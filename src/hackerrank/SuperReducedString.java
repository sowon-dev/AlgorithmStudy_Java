package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperReducedString {
  //옆자리에 동일한 알파벳이 있다면 제거하여 남는 문자를 리턴하는 문제.
  static String superReducedString(String s) {

    //List에 s 나눠서 넣기
    List<String> l = new ArrayList<>();

    /* for문과 addAll() 동일
    for(String a : s.split("")) l.add(a);
    */
    Collections.addAll(l, s.split(""));

    int i = 0;
    while(i != l.size()){

      //더이상 같은 알파벳이 없을때 반복문 종료
      if((i+1) == l.size()) break;
      
      //옆자리 알파벳이 같으면 둘 다 제거
      if(l.get(i).equals(l.get(i+1))){
        l.remove(i);
        l.remove(i);
        i = 0;
      }else{
        i++;
      }

    }

    //list를 String으로 변경
    String reduced = "";
    for(String e : l){
      reduced += e;
    }

    return reduced.length() == 0 ? "Empty String" : reduced;
  }

  public static void main(String[] args) {
    System.out.println(superReducedString("abba")+", ans: Empty String");
    System.out.println(superReducedString("aaabccddd")+", ans: abd");
    System.out.println(superReducedString("aa")+", ans: Empty String");
    System.out.println(superReducedString("baab")+", ans: Empty String");
  }
}
