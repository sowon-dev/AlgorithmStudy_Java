package codeup100;

import java.util.Scanner;

public class c1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		//첫번째방법
		while(num != 0){
			num--;
			System.out.println(num);
		}
		
		//두번째방법	
/*		while(true){
			num--;
			System.out.println(num);
			if(num == 0) break;
		}*/
		
	}//end of main()
}
