package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2908
// 상수
public class _2908 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] nums = br.readLine().split(" ");
    String[] convertNum = new String[]{"", ""};

    // 숫자 거꾸로 만들기
    for(int i=0;i<2;i++){
      char[] originNum = nums[i].toCharArray();
      for(int j=2; j>=0; j--){
        convertNum[i] += originNum[j];
      }
    }

    // 최대값구하기

    // sol1 memory 11488 runtime 76
    /*
    int max = Integer.parseInt(convertNum[0]);
    if(max < Integer.parseInt(convertNum[1])){
      max = Integer.parseInt(convertNum[1]);
    }
    System.out.println(max);
    */

    // sol2 Math 메서드 사용 memory 11468 runtime 80
//    System.out.println(Math.max(Integer.parseInt(convertNum[0]), Integer.parseInt(convertNum[1])));

    // sol3 모두 변수로 처리 memory 11448 runtime 76
    int num1 = Integer.parseInt(convertNum[0]);
    int num2 = Integer.parseInt(convertNum[1]);
//    if(num1 > num2){
//      System.out.println(num1);
//    }else{
//      System.out.println(num2);
//    }

    // sol4 모두 변수+삼항연산자 memory 11540 runtime 76
    System.out.println(num1 > num2 ? num1 : num2);
  }
}
/*
input
734 893

output
437
 */