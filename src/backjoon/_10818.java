package backjoon;
// https://www.acmicpc.net/problem/10818
// 최소, 최대

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10818 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    // sol1 Math함수 사용하기
    // memory 116352 runtime 420 -> br.close()하면 memory 116588 runtime 404
    /*
    int min = Integer.parseInt(st.nextToken());
    int max = min;
    for(int i=1; i<n; i++){ //i가 0이 아닌 1인 이유는 min, max 선언할때 5개의 숫자중 첫번째 토큰을 사용했기때문
      int num = Integer.parseInt(st.nextToken());
      min = Math.min(min, (num));
      max = Math.max(max, (num));
    }
    br.close();
    System.out.println(min+" "+max);
    */

    // sol2 배열정렬로 풀기 
    // memory 114572 runtime 1000 -> br.close()하면 memory 115624	runtime 1016
    /*
    int i = 0;
    int[] arr = new int[n];
    while(st.hasMoreTokens()) {
      arr[i] = Integer.parseInt(st.nextToken());
      i++;
    }

    Arrays.sort(arr);
    System.out.println(arr[0] + " " + arr[n-1]);
    */

    // sol3 배열없이 받은 문자 즉시 비교하기
    // memory 107004 runtime 472
    int max = -1000001;
    int min = 1000001;

    while(st.hasMoreTokens()) {
      int val = Integer.parseInt(st.nextToken());
      if(val>max) {
        max = val;
      }
      if(val<min) {
        min = val;
      }
    }
    System.out.println(min + " " + max);
  }
}
/*
input
5
20 10 35 30 7
output
7 35
 */