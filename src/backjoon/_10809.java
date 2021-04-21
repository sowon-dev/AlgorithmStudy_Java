package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10809
// 알파벳 찾기

public class _10809 {

  public static void main(String[] args) throws IOException {

    //memory 11496 runtime 80
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //알파벳 배열생성 후 초기화값 -1
    int[] arr = new int[26];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = -1;
    }

    String s = br.readLine();
    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if(arr[ch - 'a'] == -1) {
        arr[ch - 'a'] = i;
      }
    }

    for(int val : arr) {	// 배열 출력
      System.out.print(val + " ");
    }
  }
}
/*
input
baekjoon

output
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 */