package leetcodeEasyLevel;

import java.util.ArrayList;
import java.util.List;

public class _0118PascalsTriangle {

  public static List<List<Integer>> generate(int numRows) {
    //만들고싶은 list => List안에 List형태로 구현
    // [
    //   [1],
    //  [1 1],
    // [1 2 1],
    //          ]

    List<List<Integer>> triangle = new ArrayList<List<Integer>>();
    if(numRows == 0) return triangle;

    for(int i = 0; i < numRows; i++){ //0 1 2
      List<Integer> level = new ArrayList<>(); //리스트 3개만듦
      for(int j = 0; j<=i; j++){
        // 각 리스트의 0번째 인덱스는 1을 넣는다.
        // 마지막 인데스에도 1을 넣는다
        if(j == 0 || j == i){
          level.add(1);
        }else{
          List<Integer> preRow = triangle.get(i-1); //윗 행의 앞번째 인덱스 값을 가져온다
          level.add(preRow.get(j) + preRow.get(j-1));
        }

      }
      triangle.add(level);
    }
    return triangle;
  }

  public static void main(String[] args) {
    System.out.println(generate(3));
  }
}
