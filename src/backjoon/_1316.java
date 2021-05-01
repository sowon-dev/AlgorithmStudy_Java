package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// https://www.acmicpc.net/problem/1316
// 그룹 단어 체커
public class _1316 {
  // memory 11488 runtime 80
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    int cnt = 0;
    int numberOfwords = Integer.parseInt(br.readLine());
    for (int i = 0; i < numberOfwords; i++) {
      if (check()) {
        cnt++;
      }
    }
    System.out.print(cnt);
  }

  static boolean check() throws IOException{
    // 각 요소는 알파벳을 나타내는 불리언 배열로, 알파벳이 나온적있는지 유무만 확인하면 되기때문에 boolean타입으로 설정했다.
    boolean[] check = new boolean[26];
    int prev = 0;
    String str = br.readLine();

    for(int i = 0; i < str.length(); i++) {
      int now = str.charAt(i);

      if (prev != now) {
        if (!check[now - 'a']) {
          check[now - 'a'] = true;
          prev = now;
        }
        else {
          return false;
        }
      }
    }
    return true;
  }
}
/*
input
3
happy
new
year

output
3
 */