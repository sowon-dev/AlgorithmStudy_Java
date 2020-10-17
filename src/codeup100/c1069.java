package codeup100;

import java.util.Scanner;

public class c1069 {

  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    String a = sc.nextLine();
    sc.close();

    switch (a) {
    case "A": 
      System.out.println("best!!!");
      break;
    case "B": 
      System.out.println("good!!");
      break;
    case "C": 
      System.out.println("run!");
      break;
    case "D": 
      System.out.println("slowly~");
      break;
    default:
      System.out.println("what?");
    }   
  }
}
