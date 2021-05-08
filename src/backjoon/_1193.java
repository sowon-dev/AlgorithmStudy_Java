package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1193
// 분수찾기

public class _1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// memory 11492 runtime 76
		int X = Integer.parseInt(br.readLine());
		int line = 0;
		int cnt = 0; //칸의 개수

		// X가 몇 번째 대각선 위에 있는지 구하기
		while (cnt < X) {
			line++;
			// 대각선별 칸의 개수가 1,3,6,10,...으로 누적합으로 커진다.
			cnt += line; //1씩 증가하는 누적합
		}
//		System.out.println("line: "+line+", cnt: "+cnt);
		
		// 대각선이 홀수일때 분모가 큰 수
		if (line % 2 != 0) {
			int top = 1 + (cnt - X);
			int bottom = line - (cnt - X);
			System.out.println(top + "/" + bottom);
		} 
		// 대각선이 짝수일때 분자가 큰 수
		else {
			int top = line - (cnt - X);
			int bottom = 1 + (cnt - X);
			System.out.println(top + "/" + bottom);
		}
	}
}
/*
 * input 14 output 2/4
 */