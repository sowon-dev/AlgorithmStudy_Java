package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1152
// 단어의 개수
public class _1152 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // sol1
    // memory 27208 runtime 200
    String[] words = br.readLine().split(" ");
    int cnt = words.length;
    for(String s : words){
      if(s.length() == 0){
        cnt--;
      }
    }
    System.out.println(cnt);

    // sol2
    // memory 20376 runtime 180
//    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//    System.out.println(st.countTokens());
  }
}
/*
input
The Curious Case of Benjamin Button
output
6

input
 Mazatneunde Wae Teullyeoyo
output
3
 */
