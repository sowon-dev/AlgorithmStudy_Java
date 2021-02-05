package leetcodeEasyLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0350IntersectionofTwoArraysII {

  public static int[] intersect(int[] nums1, int[] nums2) {
    // Runtime 2 ms Memory 39.1 MB
    List<Integer> ans = new ArrayList<>();

    Arrays.sort(nums1);
    Arrays.sort(nums2);

    int i = 0;
    int j = 0;

    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] == nums2[j]) {
        ans.add(nums1[i]);
        i++;
        j++;
      } else if (nums1[i] < nums2[j]) {
        i++;
      } else {
        j++;
      }
    }

    //convert to int array
    int[] arr = new int[ans.size()];
    int k = 0;
    for (int num : ans) {
      arr[k++] = num;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    int[] nums3 = {4, 9, 5};
    int[] nums4 = {9, 4, 9, 8, 4};
    System.out.println(Arrays.toString(intersect(nums1, nums2)));
    System.out.println(Arrays.toString(intersect(nums3, nums4)));
  }
}
