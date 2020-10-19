package codeup100;

import java.util.Scanner;

public class c1092 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt(); //유저1의 방문주기 3
		int b = sc.nextInt(); //유저2의 방문주기 7
		int c = sc.nextInt(); //유저3의 방문주기 9
		sc.close();

		//최소공배수
		int day = 1;
		while(day%a!=0 || day%b!=0 || day%c!=0) day++;
		System.out.println(day);

	}
}
