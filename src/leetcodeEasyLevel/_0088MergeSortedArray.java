package leetcodeEasyLevel;

public class _0088MergeSortedArray {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; //2
        int j = n - 1; //2
        int k = m + n - 1; //5

        while (i >= 0 && j >= 0) { //2 2, 2 1, 2 0
            if (nums1[i] > nums2[j]) { //nums1[2] 3 > nums2[2] 6, nums1[2] 3 > nums2[1] 5, nums1[2] 3 > nums2[0] 2
                nums1[k--] = nums1[i--]; // nums1[2] = nums1[1]
            } else {
                nums1[k--] = nums2[j--]; // nums1[4] = nums2[1] 5, nums1[3] = nums2[0] 2,
            }
        }

        while (j >= 0) { //j=2, j=1, j=0
            nums1[k--] = nums2[j--]; //nums1[4] = nums2[1], nums1[3] = nums2[2], nums1[5] = nums2[3]
        }

        //출력
        for(int a : nums1){
            System.out.print(a+" ");
        }
    }

    //test cases
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n =3;

        merge(nums1, m, nums2, n);
    }
}
