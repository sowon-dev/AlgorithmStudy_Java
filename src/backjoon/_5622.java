package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/5622
// 다이얼
public class _5622 {

  public static void main(String[] args) throws IOException {
    //sol memory 11432 runtime 76
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] dials = br.readLine().toCharArray();
    int minSec = 0;

    for(char c : dials){
      switch (c){
        case 'A': case 'B': case 'C':
          minSec += 3;
          break;

        case 'D' : case 'E': case 'F' :
          minSec += 4;
          break;

        case 'G' : case 'H': case 'I' :
          minSec += 5;
          break;

        case 'J' : case 'K': case 'L' :
          minSec += 6;
          break;

        case 'M' : case 'N': case 'O' :
          minSec += 7;
          break;

        case 'P' : case 'Q': case 'R' : case 'S' :
          minSec += 8;
          break;

        case 'T' : case 'U': case 'V' :
          minSec += 9;
          break;

        case 'W' : case 'X': case 'Y' : case 'Z' :
          minSec += 10;
          break;
      }
    }
    System.out.println(minSec);
  }
}
/*
input
UNUCIC

output
36
 */