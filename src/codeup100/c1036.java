package codeup100;

import java.util.Scanner;

public class c1036 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		//String을 char로 변경 후 int에 넣기
		int result = s.charAt(0);
		
		//출력
		System.out.printf("%d", result);		
	}

}
