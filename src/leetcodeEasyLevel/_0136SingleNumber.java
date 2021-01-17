package leetcodeEasyLevel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _0136SingleNumber {
  public static int singleNumber(int[] nums) {
    //sol1 => Runtime 1 ms Memory 47.9 MB
    // 비트 연산자(^) : 대응되는 비트가 서로 같으면 0을, 다르면 1을 반환함. (비트 XOR 연산)
    // http://www.tcpschool.com/c/c_operator_bitwise
  /*
    int val=0;
    for(int i=0;i<nums.length;i++){
      val^=nums[i];
    }
    return val;
 */

    //sol2 => Runtime 10 ms Memory 40 MB
    // HashSet :  contains()을 통해 있으면 remove, 없으면 add해서 남은
    // https://www.w3schools.com/java/java_hashset.asp

    Set<Integer> box = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
        if (box.contains(nums[i])) {
            box.remove(nums[i]);
        } else {
            box.add(nums[i]);
        }
    }
    return box.stream().findFirst().get();
  }

  public static void main(String[] args) {
    int[] nums =// {2, 2, 1};
        //{4,1,2,1,2};
        //{1};
        //{-1,-1,-2}; //=> -2
        //{1,3,1,-1,3};
        {-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354}; //=> 354
    System.out.println(singleNumber(nums));

  }

}
