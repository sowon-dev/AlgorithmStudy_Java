package codeup100;

import java.util.Scanner;

public class c1066  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        sc.close();

        for(int i=0; i<nums.length; i++){
            if(Integer.parseInt(nums[i])%2 == 0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}