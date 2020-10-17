package codeup100;

import java.util.Scanner;

public class c1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        sc.close();

        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[1]);
        System.out.printf("%d\n%d\n%d\n%d\n%d\n%.2f", num1+num2, num1-num2, num1*num2, num1/num2, num1%num2, (double)num1/num2);
    }
}
