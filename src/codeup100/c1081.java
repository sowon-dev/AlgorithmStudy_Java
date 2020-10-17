package codeup100;

import java.util.Scanner;

public class c1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		sc.close();
		
		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[1]);
		
		for(int i=1; i<=num1; i++){
			for(int j=1; j<=num2; j++){
				System.out.printf("%d %d\n", i, j);
			}
		}
		
	}//end of main()
}
