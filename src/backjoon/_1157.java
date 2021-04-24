package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1157
// 단어 공부
public class _1157 {

  public static void main(String[] args) throws IOException {
    // sol1
    // memory 26428 runtime 212
    // word.length는 변수화하고 alphabet.length는 26으로 변경하면 memory 26616 runtime 220
    /*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] word = br.readLine().toUpperCase().toCharArray();
    int[] alphabet = new int[26]; //알파벳은 총 26개니까 26개의 배열 선언
    int maxCntOfalphabet = 0;
    char ans = '?';
    int overlap = 0;

    // 주어진 단어 중 사용된 알파벳의 횟수를 alphabet 배열에 담기
    for(int i=0; i<word.length; i++){
      alphabet[(int)word[i] - 'A']++;
    }

    // 가장 많이 사용된 알파벳 구하기
    for(int i : alphabet){
      maxCntOfalphabet = Math.max(maxCntOfalphabet, i);
    }

    // 출력하기
    for(int i=0; i<alphabet.length; i++){

      if(alphabet[i] == maxCntOfalphabet){
        ans = (char) (i+'A');
        overlap++;
      }
    }
    System.out.println( overlap > 1 ? "?" : ans);
    */
    // sol2
    // word.length()를 자체를 for문에 사용 memory 20620 runtime 184
    // word.length()를 변수화한 뒤 사용 memory 20416 runtime 192
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();
    int[] alphabet = new int[26];
    int len = word.length(); // length를 변수화하면 메모리 200정도 줄더들고 런타임은 8초정도 늘어든다.

    // 주어진 단어 중 사용된 알파벳의 횟수를 alphabet 배열에 담기
    for(int i=0; i<len; i++) {
      int idx = Character.toLowerCase(word.charAt(i)) - 'a';
      alphabet[idx]++;
    }

    int max = -1;
    char answer = '?';

    for(int i=0; i<26; i++) {
      if(alphabet[i] > max) {
        max = alphabet[i];
        answer = (char) (i+65);
      } else if(alphabet[i] == max)
        answer = '?';
    }

    System.out.println(answer);

  }
}
/*
input
Mississipi

output
?

input
baaa

output
A
 */