package leetcodeEasyLevel;

import java.util.Arrays;

public class _0283MoveZeroes {
  public static void moveZeroes(int[] nums) {
    //Runtime 0 ms Memory 41.7 MB
    int index = 0;
    //0이 아닌 수들을 차례대로 담기
    for(int i =0; i< nums.length; i++) {
      if (nums[i] != 0) {
        nums[index] = nums[i];
        index++;
      }
    }
    //나머지 길이만큼 0넣기
    while (index != nums.length){
        nums[index] = 0;
        index++;
    }

    System.out.println("nums: "+ Arrays.toString(nums));
    //print result
    System.out.println(Arrays.toString(nums));
  }

  public static void main(String[] args) {
    int[] nums = {0,1,0,3,12};
    moveZeroes(nums);
    System.out.print("답 : [1, 3, 12, 0, 0]");
  }
}
