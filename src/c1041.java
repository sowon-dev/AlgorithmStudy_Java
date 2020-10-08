import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);

    //첫번째 방법
    String s = sc.next();
    sc.close();
    
    //String -> char
    char c = s.charAt(0);

    //char+1
    int i = c+1;

    //char로 출력
    System.out.printf("%s\n---", (char)i);

    //두번째방법
    //char a = sc.nextLine().charAt(0);
    //sc.close();

    System.out.printf("%c", a+1);
  }
}
