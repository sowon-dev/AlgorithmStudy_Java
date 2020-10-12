import java.util.Scanner;

public class c1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        
        // 풀이방법 2가지

        // 첫번째 : 다중 if조건문
        if(a>0){
            System.out.println("plus");
        }else{
            System.out.println("minus");
        }

        if(a%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        // 두번째 : 중첩 if조건문(중복때문에 비효율적임)
        if(a>0){
                System.out.println("plus");
            if(a%2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }else{
            System.out.println("minus");
            if(a%2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
