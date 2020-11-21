package codeup100;

import java.util.Scanner;

public class c1098 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        //첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[h+1][w+1];

        //두 번째 줄에 놓을 수 있는 막대의 개수(n)
        int n = sc.nextInt(); //3

        //세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.
        // 2 0 1 1
        // 3 1 2 3
        // 4 1 2 5
        for(int a=0; a<n; a++){
            int l = sc.nextInt(); //2, 3
            int d = sc.nextInt(); //0, 1
            int x = sc.nextInt(); //1, 2
            int y = sc.nextInt(); //1, 3

            // 가로방향
            if(d == 0){
                for(int i=1; i<=l; i++){
                    arr[x][y+i-1] = 1; //1 1,1 2 (예시를 토대로 좌표를 확인)
                }
            }

            //세로방향
            else if(d == 1){
                for(int i=1; i<=l; i++){
                    arr[x+i-1][y] = 1; //2 3, 3 3, 4 3 //2 5, 3 5, 4 5, 5 5 (예시를 토대로 좌표를 확인)
                }
            }
        }
        sc.close();

        //출력
        for(int i=1; i<=h; i++){
            for(int j=1; j<=w; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
