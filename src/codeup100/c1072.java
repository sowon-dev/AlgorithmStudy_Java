package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1072 {
	public static void main(String[] args) throws IOException {
		//sol1 메모리: 15004 시간: 114
		/*
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int[] value = new int[len];
		
		for(int i = 0; i <value.length; i++) {
			value[i] =sc.nextInt();
			System.out.println(value[i]);
		}
		*/

		//sol2
		// 메모리: 14316 kb 수행 시간: 111 ms
    /*
    Scanner sc = new Scanner(System.in);
    int len =  sc.nextInt();
    int[] nums =  new int[len];

    for(int i : nums){
      nums[i] =  sc.nextInt();
      System.out.println(nums[i]);
    }
    sc.close();
    */

		//sol3
		// 메모리 :11132 kb 수행 시간:68 ms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		String[] num = br.readLine().split(" ");
		for(String s : num){
			System.out.println(s);
		}
	}
}
