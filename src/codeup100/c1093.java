package codeup100;

import java.util.Scanner;

public class c1093 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int count = sc.nextInt(); //출석 번호를 부른 횟수
		
		
		int[] students = new int[23];
		int numbers = 0;
		for (int i = 0; i<count; i++) {
			numbers = sc.nextInt(); //무작위로 부른 n개의 번호(1 ~ 23)
			students[numbers - 1] += 1;
		}
		sc.close();
		
		//출력
		for (int j = 0; j < students.length; j++) {
			System.out.printf("%d ", students[j]);
		}

	}
}
