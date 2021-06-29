package backjoon;
// https://www.acmicpc.net/problem/9184
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _9184 {
  // 함수 w는 0이하는 1을 호출하고 20이상은 20을 호출하기때문에 길이는 21로 설정
  static int[][][] dp = new int[21][21][21];
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    // memory 24808	 runtime 228
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      // -1 -1 -1 이 나오면 종료
      if (a == -1 && b == -1 && c == -1) {
        break;
      }
      sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a ,b ,c)).append('\n');
    }
    System.out.println(sb);
  }

  static int w(int a, int b, int c) {

    // 이미 저장되어있는 값은 그대로 호출
    if(inRange(a, b, c) && dp[a][b][c] != 0) {
      return dp[a][b][c];
    }

    if(a <= 0 || b <= 0 || c <= 0) {
      return 1;
    }

    if(a > 20 || b > 20 || c > 20) {
      return dp[20][20][20] = w(20, 20, 20);
    }

    if(a < b && b < c) {
      return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
    }

    return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
  }

  // a,b,c의 범위가 0 ~ 20 사이인지 체크
  static boolean inRange(int a, int b, int c) {
    return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
  }
}
/*
input
1 1 1
2 2 2
10 4 6
50 50 50
-1 7 18
-1 -1 -1

output
w(1, 1, 1) = 2
w(2, 2, 2) = 4
w(10, 4, 6) = 523
w(50, 50, 50) = 1048576
w(-1, 7, 18) = 1
 */