package codeup100;

import java.util.Scanner;

public class c1098 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        //첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[h][w];

        //두 번째 줄에 놓을 수 있는 막대의 개수(n)
        int n = sc.nextInt(); //3

        //세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.
        // 2 0 1 1
        int l = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();


        sc.close();
    }
}
