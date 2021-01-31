package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1080 {
    public static void main(String[] args) throws IOException {
        //sol1 Memory 14952 Runtime 113
        /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        int i;
        for(i = 1; sum < num; i++){
            sum += i;
        }
        System.out.println(i-1);
        */

        //sol2
        // Using sc.close()  :  Memory 14348 Runtime 114
        // Not using sc.close() : Memory 14312 Runtime 112
        /*
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        sc.close();

        int tempSum = 0;
        int i = 0;
        for(i=0;  tempSum < sum; i++){
          tempSum += i;
          if(tempSum >= sum) break;
        }
        System.out.println(i);
        */

        //sol3 : use BufferReader
        //Memory 11128 Runtime 66
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        int tempSum = 0;
        int j = 0;
        for(j=0;  tempSum < sum; j++){
            tempSum += j;
            if(tempSum >= sum) break;
        }
        System.out.println(j);
    }
}
