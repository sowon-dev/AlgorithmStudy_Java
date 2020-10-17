package codeup100;

import java.util.Scanner;

public class c1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time = sc.next();
        sc.close();

        String[] timeArr = time.split(":");

        //String으로 받는 경우 6:00:00을 입력받았을때 0이 아닌 00이 출력되어 잘못된 풀이가 된다.
        //System.out.println(timeArr[1]);

        int min = Integer.parseInt(timeArr[1]);
        System.out.printf("%d", min);
    }
}
