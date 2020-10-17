package codeup100;

import java.util.Scanner;

public class c1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] nums = input.split(" ");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);

        System.out.printf("%d", num1/num2);
    }
}
