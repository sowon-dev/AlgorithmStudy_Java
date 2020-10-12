import java.util.Scanner;

public class c1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();

        // 풀이방법 2가지
        // 첫번째 : if문
        if(score >=90 && score <=100){
            System.out.println("A");
        }else if(score >=70 && score < 90){
            System.out.println("B");
        }else if(score >=40 && score < 70){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
        
        // 두번째 : switch문
        switch (score/10) {
            case 10 :
            case 9 :
                System.out.println("A");
                break;
            case 8 :
            case 7 :
                System.out.println("B");
                break;
            case 6 :
            case 5 :
            case 4 :
                System.out.println("C");
                break;
            case 3 :
            case 2 :
            case 1 :
                System.out.println("D");
                break;
            default :
                System.out.println("D");
        }
    }
}
