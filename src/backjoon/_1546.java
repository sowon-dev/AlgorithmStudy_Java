package backjoon;

// https://www.acmicpc.net/problem/1546
// 평균

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1546 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cntSubject = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int max = 0;

    // sol1. 배열사용
    // memory 11912 runtime 88
    /*
    double[] arr = new double[cntSubject];
    double newSum = 0;

    // 최댓값 구하기
    for(int i=0; i<cntSubject; i++){
      arr[i] = Integer.parseInt(st.nextToken());
      max = (int) Math.max(arr[i], max);
    }

    // 평균구하기
    for(double score : arr){
      newSum += score/max*100;
    }

    System.out.println(newSum/cntSubject);
     */
    // sol2 배열사용하지않고 풀기
    // memory 11780 runtime 84

    double newSum = 0.0;
    for (int i = 0; i < cntSubject; i++) {
      int value = Integer.parseInt(st.nextToken());

      if(value > max) {
        max = value;
      }
      newSum += value;
    }

    System.out.println( ((newSum/max)*100.0)/cntSubject );
  }

}
/*
input
3
40 80 60
output
75.0

input
5
1 2 4 8 16
output
38.75
 */