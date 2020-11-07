package codeup100;

import java.util.Scanner;

public class c1087 {
    public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	int endNum = sc.nextInt();
	sc.close();

	int sum = 0;
	for(int i=0; ; i++) {
		if(endNum <= sum) break;
		sum += i;
	}
	System.out.println(sum);
    }
}
