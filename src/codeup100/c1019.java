package codeup100;

import java.util.Scanner;

//제출시에는 반드시 클래스 이름은 Main 으로 할 것
class c1019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        sc.close();

        String[] arr = date.split("\\.");
        int y = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int d = Integer.parseInt(arr[2]);

        System.out.printf("%04d.%02d.%02d", y, m, d);
    }
}