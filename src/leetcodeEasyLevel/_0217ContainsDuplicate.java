package leetcodeEasyLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0217ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    //sol1 Runtime 5 ms Memory 46.2 MB
    /*
    Set<Integer> nSet = new HashSet<>();
    boolean isDuplicated = false;

    for(int i=0; i<nums.length; i++){
      //add하면서 중복된 숫자가 있는지 확인
      if(!nSet.add(nums[i])){
        isDuplicated = true;
      }
    }
    return isDuplicated;
*/
    //sol2 Runtime 3 ms Memory 41.9 MB
    /*
    Arrays.sort(nums);
    for(int i=0; i< nums.length-1; i++){
      if(nums[i] == nums[i+1]) return true;
    }
    return false;
    */

    //sol3 Runtime 6 ms Memory 45.2 MB
    Set<Integer> numSet = new HashSet<>();
    for(int i:nums){
      if(numSet.contains(i)){
        return true;
      } else {
        numSet.add(i);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    //int[] nums = {1,2,3,1};//=> true
    int[] nums = {1,2,3,4};//=> false

    System.out.println(containsDuplicate(nums));
  }
}
