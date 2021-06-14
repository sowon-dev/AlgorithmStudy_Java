package backjoon;
// https://www.acmicpc.net/problem/18870
// 좌표 압축
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _18870 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 359492 runtime 1696
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int[] nums = new int[N];
    for (int i = 0; i < N; i++){
      nums[i] = Integer.parseInt(st.nextToken());
    }

    // 정렬
    int[] sortNums = nums.clone();
    Arrays.sort(sortNums);

    // 중복되지 않는 좌표값과 idx저장
    Map<Integer, Integer> map = new HashMap<>();
    int idx = 0;
    for(int n : sortNums){
      if(!map.containsKey(n)){
        map.put(n, idx++);
      }
    }
    
    // 출력
    StringBuffer sb = new StringBuffer();
    for(int n : nums){
      sb.append(map.get(n)).append(" ");
    }
    System.out.println(sb);
  }
}
/*
input
5
2 4 -10 4 -9

output
2 3 0 3 1
 */