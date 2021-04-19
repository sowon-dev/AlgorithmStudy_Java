package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11720
// 숫자의 합
public class _11720 {

  public static void main(String[] args) throws IOException {
    // sol1 배열사용
    // memory 11652 runtime 84
    /*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());
    String[] nums = br.readLine().split("");
    int sum = 0;

    //Convert String array to int array
    int[] intNums = new int[cnt];
    for(int i=0; i<cnt; i++){
      intNums[i] = Integer.parseInt(nums[i]);
    }

    //Sum
    for(int n : intNums){
      sum += n;
    }
    System.out.println(sum);
    */

    // sol2 배열사용하지않고 getBytes()사용
    // memory 11480 runtime 80
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine(); // cnt는 사용하지 않으므로 입력만 받음
    int sum = 0;
    for(byte n : br.readLine().getBytes()){
      sum += (n - 48);
      //sum += (n - '0'); // n-48과 n-'0'은 같은 의미인데 그 이유는 아스키코드에서 숫자 1은 49부터 시작하기때문에 숫자 0인 48을 빼줘야 함.
    }
    System.out.println(sum);
  }
}
/*
input
1
1
output
1

input
25
7000000000000000000000000
output
7
 */