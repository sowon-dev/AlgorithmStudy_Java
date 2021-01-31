package leetcodeEasyLevel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _0268MissingNumber {
  public static int missingNumber(int[] nums) {
    //sol1 : use Arrays.sort()
    //Runtime 4 ms Memory 39.5 MB
    /*
    Arrays.sort(nums);

    //control an edge case
    if(nums.length == 1 && nums[0] == 0) return 1;

    for(int i=0; i<nums.length; i++){
      if(nums[i] != i){
        return i;
      }
    }
    return nums.length;
    */

    //sol2 : use sum
    // Runtime 0 ms Memory 39.3 MB
    int n = nums.length;
    int sum = n*(n+1)/2; //sum of n natural numbers
    for(int num: nums){
      sum -= num;
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] nums1 = {3,0,1}; //=>2
    int[] nums2 = {0,1}; //=>2
    int[] nums3 = {9,6,4,2,3,5,7,0,1}; //=>8
    int[] nums4 = {0}; //=>1
    int[] nums5 = {0,1,2}; //=>3

    System.out.println(missingNumber(nums1)+", ans = 2");
    System.out.println(missingNumber(nums2)+", ans = 2");
    System.out.println(missingNumber(nums3)+", ans = 8");
    System.out.println(missingNumber(nums4)+", ans = 1");
    System.out.println(missingNumber(nums5)+", ans = 3");
  }
}
