package backjoon;
// https://www.acmicpc.net/problem/9020
// 골드바흐의 추측

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//memory 20740 runtime 568
		
		int testCase = Integer.parseInt(br.readLine());
		int first = 0;
		int second = 0;
		for(int i=0; i<testCase; i++){
			int N = Integer.parseInt(br.readLine());
			for(first=N/2, second=N/2;;first--,second++){
				N = first + second;
				if(isPrime(first) && isPrime(second)){
					System.out.println(first + " " + second);
					break;
				}
			}
		}
	}
	
	static boolean isPrime(int n){
		for(int i=2; i<n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
}

/*
input 
3
8
10
16

output
3 5
5 5
5 11
*/