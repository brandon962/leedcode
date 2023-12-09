package com.brandon962.leedcode.solution;

import org.springframework.stereotype.Service;

@Service
public class MedianOfTwoSortedArrays {

    private int p1 = 0;
    private int p2 = 0;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double ans = 0;
        if ((m + n) % 2 == 0) {
            for (int i = 0; i < (m + n) / 2; i++) {
                ans = findMin(nums1, nums2);
            }
            ans = (ans + findMin(nums1, nums2)) / 2;
        } else {
            for (int i = 0; i < (m + n) / 2 + 1; i++) {
                ans = findMin(nums1, nums2);
            }
        }

        return ans;
    }

    private int findMin(int[] nums1, int[] nums2) {
        if (p1 < nums1.length && p2 < nums2.length) {
            return nums1[p1] < nums2[p2] ? nums1[p1++] : nums2[p2++];
        } else if (p1 < nums1.length) {
            return nums1[p1++];
        } else if (p2 < nums2.length) {
            return nums2[p2++];
        }

        return -1;
    }
}
