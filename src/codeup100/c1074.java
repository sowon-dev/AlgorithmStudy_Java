package codeup100;

import java.util.Scanner;

public class c1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		//첫번째방법
		while(num != 0){
			System.out.println(num);
			num--;
		}
		
		//두번째방법
/*		while(true){
			if(num == 0) break;
			System.out.println(num);
			num--;
		}*/
	}
}
