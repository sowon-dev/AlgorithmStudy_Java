package codeup100;

import java.util.Scanner;

public class c1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = ' ';

        while( c != 'q'){
            c = sc.next().charAt(0);
            System.out.println(c);
        }
        sc.close();
    }
}
