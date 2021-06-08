package backjoon;
// https://www.acmicpc.net/problem/1427
// 소트인사이드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class _1427 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //sol memory 11712 runtime 80
    String[] N = br.readLine().split("");

    Integer[] arr = new Integer[N.length];
    for(int i =0; i<N.length; i++){
      arr[i] = Integer.parseInt(N[i]);
    }
    Arrays.sort(arr, Collections.reverseOrder());

    StringBuilder sb = new StringBuilder();
    for(int i : arr){
      sb.append(i);
    }
    System.out.println(sb);
  }
}
/*
input
2143

output
4321
 */