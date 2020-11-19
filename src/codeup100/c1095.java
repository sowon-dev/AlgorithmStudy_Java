package codeup100;

import java.util.Scanner;
//10 4 2 3 6 6 7 9 8 5
public class c1095 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int count = sc.nextInt();

		int numbers = 0;
		int min = 0;
		for (int i = 0; i < count; i++) {
			numbers = sc.nextInt();

			if (i == 0) {
				min = numbers;
			} else if (min > numbers) {
				min = numbers;
			}

		}
		System.out.println(min);
	}
}
