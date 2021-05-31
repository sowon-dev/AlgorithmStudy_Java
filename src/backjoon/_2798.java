package backjoon;
// https://www.acmicpc.net/problem/2798
// 블랙잭
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2798 {
  public static void main(String[] args) throws IOException {
    // memory 11592 runtime 96
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine(), " ");
    int[] arr = new int[N];
    for(int i=0; i<arr.length; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int sum = findSum(arr, N, M);
    System.out.println(sum);
  }

  static int findSum(int[] arr, int N, int M){
    int sum = 0;
    for(int i=0; i<N-2; i++){
      for(int j=i+1; j<N-1; j++){
        for(int k=j+1; k<N; k++){
          int tempSum = arr[i]+arr[j]+arr[k];
          if(tempSum == M){
            return tempSum;
          }
          // 세 카드의 합 sum이 이전 합 tempSum보다 크면서 M 보다 작을 경우
          if(sum < tempSum && tempSum < M) {
            sum = tempSum;
          }
        }
      }
    }
    return sum;
  }
}
/*
INPUT
5 21
5 6 7 8 9

5 9
1 2 4 3 5

OUTPUT
21
 */