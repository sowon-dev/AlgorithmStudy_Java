package codeup100;

import java.util.Scanner;

public class c1065  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        sc.close();

        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int c = Integer.parseInt(nums[2]);

        if(a%2 == 0) System.out.println(a);
        if(b%2 == 0) System.out.println(b);
        if(c%2 == 0) System.out.println(c);
    }
}

