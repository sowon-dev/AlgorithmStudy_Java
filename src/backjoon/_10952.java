package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A+B - 5
public class _10952 {

  public static void main(String[] args) throws Exception {

    // sol. memory 11592 kb runtime 84 ms
    // BufferedReader 객체 생성 (Exception이 처리를 따로 해줘야 함)
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // StringTokenizer 객체 선언
    StringTokenizer st;

    while (true) {
      st = new StringTokenizer(br.readLine(), " "); //한 줄씩

      //String to int로 형변환
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if (a == 0 && b == 0) {
        break;
      }

      System.out.println(a+b);
    }
  }
}
