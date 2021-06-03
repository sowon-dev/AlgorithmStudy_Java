package backjoon;
// https://www.acmicpc.net/problem/7568
// 덩치
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7568 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 11500 runtime 84
    int N = Integer.parseInt(br.readLine());
    
    // 2차원 배열에 넣기
    int[][] arr = new int[N][2];
    String[] ppl;
    for(int i = 0; i < N; i++) {
      ppl = br.readLine().split(" ");
      arr[i][0] = Integer.parseInt(ppl[0]);	// 몸무게
      arr[i][1] = Integer.parseInt(ppl[1]);	// 키
    }

    // 순위정하기
    for(int i=0; i<N; i++){
      int rank = 1;
      for(int j=0; j<N; j++){
        if(i == j) continue;
        if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
          rank++;
        }
      }
      System.out.print(rank + " ");
    }
  }
}
/*
input
5
55 185
58 183
88 186
60 175
46 155

output
2 2 1 2 5
 */