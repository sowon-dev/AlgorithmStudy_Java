package leetcodeEasyLevel;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums;
        int target;

        //test case1
        nums = new int[]{3, 2, 4};
        target = 6;

        //test case2
        nums = new int[]{2, 7, 11, 15};
        target = 9;

        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        //return ans;
        System.out.println(Arrays.toString(ans));
    }
}
