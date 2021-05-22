package backjoon;
// https://www.acmicpc.net/problem/3053
// 택시 기하학
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3053 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //memory 11780 runtime 88
    double R = Double.parseDouble(br.readLine());
    double taxiR = R*2;
    System.out.format("%.6f%n", R * R * Math.PI);
    System.out.format("%.6f%n", R * R * 2);
  }
}
/*
input
1

21

output
3.141593
2.000000

1385.442360
882.000000
 */