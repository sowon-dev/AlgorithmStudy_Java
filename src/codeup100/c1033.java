package codeup100;

import java.util.Scanner;

public class c1033 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		//16진수 소문자출력은 x 대문자출력은 X 
		System.out.printf("%X", num);		
	}

}
