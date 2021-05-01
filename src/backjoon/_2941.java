package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// https://www.acmicpc.net/problem/2941
// 크로아티아 알파벳
public class _2941 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();
    int cnt = 0;

    // sol 첫방법실패
    // 이 접근법은 replace되고 남은 뒷부분 알파벳뿐만아니라 이미 지나간 알파벳과 함께 크로아티아 알파벳인지 체크하기때문에 오류가 발생함
    /*
    String[] croatiaAlpha = new String[]{"c=", "c-","dz=", "d-", "lj", "nj", "s=", "z="};

    for(int i=0; i<croatiaAlpha.length; i++){
      if(word.contains(croatiaAlpha[i])){
        cnt++;
        word = word.replace(croatiaAlpha[i], "");
      }
    }
    cnt = cnt + word.length();
    */

    // sol2 memory 11484 runtime 80
    int len = word.length();
    for (int i = 0; i < len; i++) {

      char alphabet = word.charAt(i);
      if (alphabet == 'c' && i < len - 1) {
        if (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-') {
          i++;
        }
      }
      else if (alphabet == 'd' && i < len - 1) {
        if (word.charAt(i + 1) == '-') {
          i++; //d-인 경우 조건문의 word길이에서 1를 빼줘야한다
        }
        else if (word.charAt(i + 1) == 'z' && i < len - 2) {
          if (word.charAt(i + 2) == '=') {
            i += 2; //dz-인경우 조건문의 word길이에서 2를 빼줘야한다
          }
        }
      }
      else if ((alphabet == 'l' || alphabet == 'n') && i < len - 1) {
        if (word.charAt(i + 1) == 'j') {
          i++;
        }
      }
      else if ((alphabet == 's' || alphabet == 'z') && i < len - 1) {
        if (word.charAt(i + 1) == '=') {
          i++;
        }
      }
      cnt++;
    }
    System.out.println(cnt);
  }
}
/*
input
nljj

output
3

input
c=c=

output
2
 */