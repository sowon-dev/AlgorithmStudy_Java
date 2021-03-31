package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A+B - 4
public class _10951 {

  public static void main(String[] args) throws IOException {
    //sol. memory 11596 kb runtime 84 ms
    //필요한 기본 객체들 선언
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    String line;
    while ((line = br.readLine()) != null) {
      st = new StringTokenizer(line, " ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      System.out.println(a+b);
    }
    br.close();
  }
}
