package codeup100;

import java.util.Scanner;

public class c1095 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int count = sc.nextInt(); //번호를 부른 횟수

		//10
		//10 4 2 3 6 6 7 9 8 5

		int numbers = 0;
		int min = 0;
		for (int i = 0; i < count; i++) {
			numbers = sc.nextInt(); //count개의 랜덤번호

			if (i == 0) {
				min = numbers;
			} else if (min > numbers) {
				min = numbers;
			}

		}
		System.out.println(min);
		sc.close();
	}
}
