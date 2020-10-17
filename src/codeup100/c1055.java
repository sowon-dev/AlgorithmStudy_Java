package codeup100;

import java.util.Scanner;

public class c1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        sc.close();

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if( a == 1 || b == 1) System.out.println(1);
        else System.out.println(0);
    }
}

