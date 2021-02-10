package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
  static List<Integer> gradingStudents(List<Integer> grades) {
    // 5의 배수와의 차가 3보다 작으면 올림하기

    //sol1
    /*
    List<Integer> result = new ArrayList<>();
    for(int i=0; i<grades.size(); i++){
      if(grades.get(i) < 38) continue;
      if((((grades.get(i)/5 + 1) * 5) - grades.get(i)) < 3){
        grades.set(i, ((grades.get(i)/5 + 1) * 5));
      }
    }

    //You can use addAll() instead of loop
    for(int g : grades){
      result.add(g);
    }
    result.addAll(grades);
    return result;
    */

    //sol2. You can use param only
    for(int i=0; i<grades.size(); i++){
      if(grades.get(i) < 38) continue;
      if((((grades.get(i)/5 + 1) * 5) - grades.get(i)) < 3){
        grades.set(i, ((grades.get(i)/5 + 1) * 5));
      }
    }
    return grades;
  }

  public static void main(String[] args) {
    System.out.println(gradingStudents(new ArrayList<>(Arrays.asList(73, 67, 38, 33)))+"ans : 75, 67, 40, 33");
  }
}
