package codeup100;

import java.util.Scanner;

public class c1089 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		sc.close();
		
		int a = Integer.parseInt(nums[0]);
		int d = Integer.parseInt(nums[1]);
		int n = Integer.parseInt(nums[2]);
		
		int sum=0;
		for(int i=0; i<n ; i++){
			sum = a+(d*i);
		}
        System.out.println(sum);
               
	}
}
