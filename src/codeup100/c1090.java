package codeup100;

import java.util.Scanner;

public class c1090 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		sc.close();
		
		int a = Integer.parseInt(nums[0]); //시작값
		int r = Integer.parseInt(nums[1]); //등비
		int n = Integer.parseInt(nums[2]); //몇번째인지 나타내는 숫자
		
   		// int에 최종 출력값이 들어가지 않으므로 long으로 만든다.
		// 10 10 10 => 10000000000
		//등비임으로 제곱메서드로 해결
		
		long sum=0;
		for(int i=0; i<n ; i++){
			sum = (long) (a*Math.pow(r, i));
		}
		
        System.out.println(sum);
               
	}
}
