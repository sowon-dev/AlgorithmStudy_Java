package codeup100;

import java.util.Scanner;

public class c1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        sc.close();

        double h = Double.parseDouble(data[0]);
        double b = Double.parseDouble(data[1]);
        double c = Double.parseDouble(data[2]);
        double s = Double.parseDouble(data[3]);

        //1byte = 8bit, 1kb = 1024bytes, 1mb = 1024kb
        //입력 48000 32 5 300 => 274.7 MB
        double bit = h*b*c*s;
        System.out.printf("%.1f MB", bit/8/1024/1024);
    }
}
