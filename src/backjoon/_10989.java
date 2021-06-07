package backjoon;
// https://www.acmicpc.net/problem/10989
// 수 정렬하기 3
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10989 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    // sol1: Collections.sort() 메모리초과로 실패
    /*
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++) {
      list.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(list);
    for(int value : list) {
      sb.append(value).append('\n');
    }
    System.out.println(sb);
     */

    // sol2 카운팅정렬 사용 시간복잡도 O(N)
    // memory 480444 runtime 1612
    // 수의 범위 (0 ~ 10000) 사실상 0은 제외
    int[] cnt = new int[10001];
    for (int i = 0; i < N; i++) {
      // 해당 인덱스의 값을 1 증가
      cnt[Integer.parseInt(br.readLine())] ++;
    }

    // 0은 입력범위에서 없으므로 1부터 시작
    for(int i = 1; i < 10001; i++){
      // 값이 있는 인덱스만 sb에 추가
      while(cnt[i] > 0){
        sb.append(i).append('\n');
        cnt[i]--;
      }
    }
    System.out.println(sb);
  }
}
/*
input
10
5
2
3
1
4
2
3
5
1
7

output
1
1
2
2
3
3
4
5
5
7
 */