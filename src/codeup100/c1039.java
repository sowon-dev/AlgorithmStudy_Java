package codeup100;

import java.util.Scanner;

public class c1039 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		String[] sArr = s.split(" ");
		
		//String -> long 출력(int범위를 넘기때문에 long)
		System.out.printf("%d", Long.parseLong(sArr[0])+Long.parseLong(sArr[1]));
	}
}
