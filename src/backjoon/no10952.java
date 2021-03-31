package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A+B - 5
// https://sjs2215.tistory.com/93
public class no10952 {

  public static void main(String[] args) throws Exception {
    // BufferedReader 객체 생성 (Exception이 처리를 따로 해줘야 함)
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // StringTokenizer 객체 선언
    StringTokenizer st = null;

    int n = Integer.parseInt(br.readLine());//숫자 몇개 입력할래

    // 공란 포함 String Line일시 StringTokenizer 이용
    int[] arrays = new int[n];

    st = new StringTokenizer(br.readLine()," ");
    for (int i = 0; i < n; i++) {
      // 배열에다 토큰을 하나씩 불러서 입력해줌
      arrays[i] = Integer.parseInt(st.nextToken());//숫자 n개만큼 입력 후 배열에 저장
    }
    System.out.println(arrays[0]+arrays[1]);
  }
}
