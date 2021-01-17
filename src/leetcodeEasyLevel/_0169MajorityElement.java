package leetcodeEasyLevel;

import java.util.Arrays;

public class _0169MajorityElement {
  public static int majorityElement(int[] nums) {
    //sol1 : for each Runtime 2261 ms	Memory 54.4 MB
    /*
    int majorityCount = nums.length/2;
    for(int n : nums){
      int count = 0;
      for(int elem : nums){
        if(elem == n){
          count +=1;
        }
      }
      if(count > majorityCount){
        return n;
      }
    }
      return -1;
     */

    //sol2 : Arrays
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }

  public static void main(String[] args) {
    int[] nums = {3,2,3}; //3
                // {2,2,1,1,1,2,2};  //2
    System.out.println(majorityElement(nums));
  }
}
