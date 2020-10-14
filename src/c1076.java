import java.util.Scanner;

public class c1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char leng = sc.nextLine().charAt(0);
        sc.close();

        char a = 'a';
        do {
            System.out.println(a);
            a++;
        } while (a <= leng);
    }
}
