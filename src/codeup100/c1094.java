package codeup100;

import java.util.Scanner;

public class c1094 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int k = sc.nextInt(); //출석 번호를 부른 횟수
		
		
		int[] students = new int[k];
		for (int i = 0; i<k; i++) {
			students[i] = sc.nextInt(); //무작위로 부른 n개의 번호(1 ~ 23)
		}
		sc.close();
		
		//출력
		for (int i = students.length-1; i >= 0; i--) {
			System.out.printf("%d ", students[i]);
		}

	}
}
