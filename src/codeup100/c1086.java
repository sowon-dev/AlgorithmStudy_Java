package codeup100;

import java.util.Scanner;

public class c1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        sc.close();

        int w = Integer.parseInt(data[0]);
        int h = Integer.parseInt(data[1]);
        int b = Integer.parseInt(data[2]);

        System.out.printf("%.2f MB", ((double)w*h*b)/8/1024/1024);
    }
}
