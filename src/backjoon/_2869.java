package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2869
// 달팽이는 올라가고 싶다.

public class _2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// sol1 시간초과로 실패
/*
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String[] input = br.readLine().split(" "); // 시간초과 -> StringTokenizer로 변경
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
		int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
		int V = Integer.parseInt(st.nextToken()); // 정상 높이

		int oneDay = A - B; // 하루동안 올라갈 수 있는 높이
		int day = 0;
		int sum = 0; // 누적 높이

		while (sum < V) {
			sum += oneDay;
			if (sum == V) {
				break;
			}
			day++;
		}
//		System.out.println(day); // 시간초과 -> BufferedWriter로 변경
		bw.write(String.valueOf(day));
		bw.flush();
		bw.close();
*/
		// sol2 시간초과를 해결하기위해 반복문 없이 해결
		// memory 11500 runtime 76
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
		int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
		int V = Integer.parseInt(st.nextToken()); // 정상 높이
		
		// 정상에 도달하려면  (V / (A-B))의 나머지가 0이면 된다. 하지만 초과해서 도달한 경우에는 미끄러지지않으므로 V-B를 빼준다.
		int day = (V - B) / (A - B);
		//나머지가 있다면 아직 도달하지 못한 것이므로 하루가 추가된다.
		if((V - B) % (A - B) != 0){
			day++;
		}
		System.out.println(day);
	}
}
/*
input 
2 1 5 
5 1 6
100 99 1000000000
  
output 
4 
2 
999 999 901
 */
