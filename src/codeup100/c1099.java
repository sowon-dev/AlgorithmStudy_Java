package codeup100;

import java.util.Scanner;

public class c1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //개미집 10*10
        int[][] antHouse = new int[11][11];

        //개미집에 입력값 넣기
        int w;
        for(int i=1; i<antHouse.length; i++){
            for(int j=1; j<antHouse.length; j++){
                w = sc.nextInt();
                antHouse[i][j] = w;
            }
        }

        //오른쪽 아래로 내려갈수있도록 count변수로 y좌표 기억하기
        int count = 2;
        Boolean isTwo = false;

        for(int i=2; i<11; i++){
            for(int j=count; j<11; j++) {
                System.out.println("좌표(x,y)는 ("+ i +" , "+ j + ") 값은?"+antHouse[i][j]);
                //먹이(2)인 경우
                if (antHouse[i][j] == 2) {
                    isTwo = true;
                    antHouse[i][j] = 9;
                    break;
                }

                //갈 수 있는 길(0)인 경우
                if (antHouse[i][j] == 0) {
                    antHouse[i][j] = 9;
                }

                //벽(1)인 경우
                else if (antHouse[i][j] == 1) {
                    count = j-1;
                    break;
                }

            }

            //먹이(2)인 경우
            if(isTwo) {
                break;
            }
        }
        sc.close();

        //출력
        for(int i=1; i<antHouse.length; i++){
            for(int j=1; j<antHouse.length; j++){
                System.out.printf("%d ", antHouse[i][j]);
            }
            System.out.println();
        }

    }
}