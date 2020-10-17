package codeup100;

import java.util.Scanner;

public class c1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        sc.close();

        System.out.printf("%d", Integer.parseInt(arr[0])<<Integer.parseInt(arr[1]));
    }
}
