package backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/11005

public class mento11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        sc.close();
        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        List<Character> list = new ArrayList<>();
        while(n > 0) {
            if (n % b < 10) {
                list.add((char) (n % b + '0'));
            } else { // 나머지가 10이상이면 A(10) B(11) C(12) ... Z(35)
                list.add((char) (n % b - 10 + 'A'));
            }
            n /= b; // b로 계속 나누기
        }

        //출력
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }

/*        //괄호의 중요성
        System.out.println((char) 9+'0'); //57
        System.out.print((char) (9+'0')); //9
        
        //10보다 작은 수 테스트
        System.out.print((char) (8+'0')); //8
        System.out.print((char) (7+'0')); //7
        System.out.print((char) (6+'0')); //6
        System.out.print((char) (5+'0')); //5
        System.out.print((char) (4+'0')); //4
        System.out.print((char) (3+'0')); //3
        System.out.print((char) (2+'0')); //2
        System.out.print((char) (1+'0')+"\n"); //1

        //숫자를 char로 나타내고 싶을때는 (char) 형변환
        System.out.println((char) 65); //A

        //char를 아스키코드로 나타내고 싶을때는 숫자를 더할 것
        System.out.println('A'+1); //66

        //위의 두 방법 합쳐서도 가능
        System.out.println((char) ('A'+1)); //B*/


    }//end of main()
}
