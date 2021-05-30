package backjoon;
// https://www.acmicpc.net/problem/11729
// 하노이 탑 이동 순서
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11729 {
  // memory 96080 runtime 360
  static StringBuilder sb = new StringBuilder();
  static int k = 0; //횟수

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Hanoi(N,1,2,3);
    System.out.println(k);
    System.out.println(sb);
  }

  static void Hanoi(int n,int from,int by,int to) {
    k++;
    // 원판이 1개일 때
    if(n==1) {
      sb.append(from+" "+to+"\n");
      return;
    } else { // 원판이 1개가 아닐 때
      Hanoi(n-1,from,to,by); // n-1을 한 후, 1->3->2로 원판을 전달
      sb.append(from+" "+to+"\n");
      Hanoi(n-1,by,from,to); // n-1을 한 후, 2->1->3으로 원판을 전달
    }
  }
}
/*
input
3

output
7
1 3
1 2
3 2
1 3
2 1
2 3
1 3
 */