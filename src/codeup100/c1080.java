package codeup100;

import java.util.Scanner;

public class c1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        int i;

        //내코드
/*
        for(i = 1; sum < num; i++){
            sum += i;
        }
        System.out.println(i-1);
*/

        //두번째코드
        for(i=1; i<num; i++){
            sum += i;
            if (sum >= num ) break;
        }
        System.out.println(i);
    }
}
