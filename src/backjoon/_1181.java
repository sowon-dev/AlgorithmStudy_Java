package backjoon;
// https://www.acmicpc.net/problem/1181
// 단어 정렬
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _1181 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // memory 28808 runtime 288
    int N = Integer.parseInt(br.readLine());
    // 배열에 넣기
    String[] arr = new String[N];
    for (int i = 0; i < N; i++) {
      arr[i] = br.readLine();
    }

    Arrays.sort(arr, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        // 단어 길이가 같으면 사전순
        if(o1.length() == o2.length()){
          return o1.compareTo(o2);
        } else{
          return o1.length() - o2.length(); //길이차가 양수면 자리가  바뀌고, 음수면 그대로
        }
      }
    });

    StringBuilder sb = new StringBuilder();

    //중복되는 단어는 빼고 출력하기위해 비교를 위해 첫번째 단어를 넣어둠
    sb.append(arr[0]).append("\n");

    for(int i=1; i<N; i++){
      if(!arr[i].equals(arr[i-1])){
        sb.append(arr[i]).append("\n");
      }
    }
    System.out.println(sb);
  }
}
/*
input
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours

output
i
im
it
no
but
more
wait
wont
yours
cannot
hesitate
 */