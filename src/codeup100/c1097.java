package codeup100;

import java.util.Scanner;

public class c1097 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[][] arr = new int[19][19]; //2차원배열생성

        //입력값 배열에 넣기
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = sc.nextInt();
                //System.out.printf("%d ",arr[i][j]);
            }
            //System.out.println();
        }

        int count = sc.nextInt(); // 십자 뒤집기 횟수(n)

        //1이면 0으로 0이면 1로
        for(int n=0; n<count; n++){
            int x = sc.nextInt()-1; //10 12
            int y = sc.nextInt()-1; //10 12

            //[10, i]가 0이면 1로, 1이면 0으로
            for(int i=0; i<arr.length; i++){
                if(arr[x][i] == 0){
                    arr[x][i] = 1;
                }else{
                    arr[x][i] = 0;
                }
            }

            //[j, 10]가 0이면 1로, 1이면 0으로
            for(int j=0; j<arr.length; j++){
                if(arr[j][y] == 0){
                    arr[j][y] = 1;
                }else{
                    arr[j][y] = 0;
                }
            }
        }
        sc.close();

        //답 출력
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

    }//end of main
}
