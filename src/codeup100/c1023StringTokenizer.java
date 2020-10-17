package codeup100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class c1023StringTokenizer {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();

    //split()사용
    /*
    String[] ss = s.split("");

    for(int i=0; i<ss.length; i++){
    System.out.println("'"+ss[i]+"'");
    }*/

    //StringTokenizer 사용
    StringTokenizer st = new StringTokenizer(s,".");

    while (st.hasMoreElements()) {
    System.out.println(st.nextToken());
    }

  }

}
