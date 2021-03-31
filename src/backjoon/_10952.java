package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A+B - 5
public class _10952 {

  public static void main(String[] args) throws Exception {

    //sol1 memory 11600 kb runtime 84 ms
    // BufferedReader 객체 생성 (Exception이 처리를 따로 해줘야 함)
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // StringTokenizer 객체 선언
    StringTokenizer st;

    // StringBuilder 객체 생성
    StringBuilder sb = new StringBuilder();

    while (true) {
      st = new StringTokenizer(br.readLine(), " "); //한 줄씩
      System.out.println(st);

      //String to int로 형변환
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      if (A == 0 && B == 0) {
        break;
      }
      sb.append((A + B)).append('\n');
    }

    System.out.println(sb);
  }
}
