package codeup100;

import java.util.Scanner;

public class c1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        sc.close();

        long num1 = Integer.parseInt(arr[0]);
        long num2 = Integer.parseInt(arr[1]);
        long num3 = Integer.parseInt(arr[2]);

        System.out.printf("%d\n%.1f", num1+num2+num3, (double) (num1+num2+num3)/3);
    }
}
