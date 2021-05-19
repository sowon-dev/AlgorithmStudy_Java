package backjoon;
// https://www.acmicpc.net/problem/1085

// 직사강형에서의 탈출

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//sol memory 11500 runtime 80
		String[] nums = br.readLine().split(" ");
		int x = Integer.parseInt(nums[0]);
		int y = Integer.parseInt(nums[1]);
		int w = Integer.parseInt(nums[2]);
		int h = Integer.parseInt(nums[3]);
		
		int min = x;
		min = Math.min(min, y);
		min = Math.min(min, w-x);
		min = Math.min(min, h-y);
		System.out.println(min);
	}
}
/*
input
6 2 10 3

output
1
*/