//88. Merge Sorted Array

import java.util.Arrays;
public class leet88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = m, k = 0; k < n; j++, k++) {
            nums1[j] = nums2[k];
        }
        Arrays.sort(nums1);
    }
}
