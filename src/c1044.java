import java.util.Scanner;

public class c1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //첫번째방법 double로 출력
        int a = sc.nextInt();
        sc.close();
        System.out.printf("%.0f", (double) a+1);
        
        //두번째방법 증감연산자사용 + long으로 출력
        long b = sc.nextInt();
        sc.close();
        b++;
        System.out.println(b);
    }
}
