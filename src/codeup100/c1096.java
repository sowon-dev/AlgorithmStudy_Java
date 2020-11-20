package codeup100;

import java.util.Scanner;

public class c1096 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        //바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다.
        //둘째 줄 부터 n+1 번째 줄까지 힌 돌을 놓을 좌표(x, y)가 n줄 입력된다.
        //n은 10이하의 자연수이고 x, y 좌표는 1 ~ 19 까지이며, 같은 좌표는 입력되지 않는다.

        int count = sc.nextInt(); // 바둑판에 올려 놓을 흰 돌의 개수(n)
        int[][] arr = new int[19][19]; //2차원배열생성

        for(int i=0; i<count; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            arr[x-1][y-1] = 1;
        }
        sc.close();

        //출력
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
