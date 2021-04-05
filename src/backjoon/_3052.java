package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// https://www.acmicpc.net/problem/3052
// 나머지
public class _3052 {
  public static void main(String[] args) throws IOException {
    // sol1. BufferedReader와 리스트로 풀기
    // memory 11460 runtime 76
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 나머지값이 들어 갈 리스트 생성
    List<Integer> list = new ArrayList<>();

    // 리스트에 나머지값 넣기
    for(int i = 0; i< 10; i++) {
      int reminder = Integer.parseInt(br.readLine()) % 42;
      if (!list.contains(reminder)) {
        list.add(reminder);
      }
    }

    System.out.println(list.size());

    // sol2 Scanner와 배열로만 풀기기
    // memory 18340 runtime 240
    /*
    Scanner sc = new Scanner(System.in);
    int[] num = new int[10]; //입력값이 들어갈 배열
    int[] number = new int[1000]; // 전체배열

    int a = 42;
    int count = 0;

    for (int i = 0; i < 10; i++) {
      int n = sc.nextInt();
      num[i] = n % a;
    }

    for (int i = 0; i < num.length; i++) {
      number[num[i]]++; // num값을 number의 num값 배열에 넣어줘서 1씩 증가시킴
      //System.out.printf("i: %d, num[%d]: %d, number[%d]: %d%n", i, i, num[i], i, number[i]);
    } // 값이 있으면 1, 없으면 0이 됨

    for (int i = 0; i < number.length; i++) {
      if (number[i] != 0) {
        count++;
      }
    }

    System.out.println(count);
    */
  }
}
/*
input
1
2
3
4
5
6
7
8
9
10

output
10
 */