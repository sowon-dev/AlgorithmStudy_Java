package leetcodeEasyLevel;

public class _0053MaximumSubarray {

    static int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int sum = 0;

        for(int n : nums){

            // sum이 음수값이면 고려하지않는다. 다음 n부터 합을 찾는다
            if(sum < 0 ){
                sum = 0;
            }

            sum += n; //-2, 1, -2, -3, 4, 3, 5, 6, -1, 4
            maxSub = Math.max(maxSub, sum); //-2, 1, 1, 1, 4, 4, 5, 6, 6, 6
        }
        return maxSub;
    }

    //테스트케이스
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        //int[] nums = {1};
        //int[] nums = {0};
        System.out.println(maxSubArray(nums));
    }
}
