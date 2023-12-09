package com.brandon962.leedcode.solution;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class MedianOfTwoSortedArraysTest {
    @Autowired
    MedianOfTwoSortedArrays medianOfTwoSortedArrays;
    @Test
    void testMedianOfTwoSortedArrays() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        Double ans = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        log.info(ans.toString());
    }
}
