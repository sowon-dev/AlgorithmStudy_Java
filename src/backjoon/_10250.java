package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10250
// ACM 호텔
public class _10250 {

	public static void main(String[] args) throws IOException {
		// memory 11788 runtime 92
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int leng = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0; i<leng; i++){
			st = new StringTokenizer(br.readLine(), " "); //한 줄씩
			int H = Integer.parseInt(st.nextToken());
			Integer.parseInt(st.nextToken()); // W는 사용할 곳은 없기에 변수에 담지않는다.
			int N = Integer.parseInt(st.nextToken());
			
			if(N % H == 0) {
				System.out.println((H * 100) + (N / H));
			} else {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}
		}
	}
}
/*
input
2
6 12 10
30 50 72

output
402
1203
*/