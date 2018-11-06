package com.leetcode.array;

import java.util.Arrays;

/**
 * @Author GentleNi
 * @Date 2018-09-26 21:18
 **/

public class Demo_031_NextPermutation {
    public static void main(String[] args) {
        //int[] a = {6,5,4,8,7,5,1};
        int[] a = {1,3,2};
        solve(a);
        for (int b : a) {
            System.out.print(b);
        }
    }

    public static void solve(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        int index = nums.length-1;
        while (index >= 1 && nums[index] <= nums[index-1]) {
            --index;
        }

        if (index == 0) {
            Arrays.sort(nums);
            return;
        }

        int restMax = Integer.MAX_VALUE;
        int resMaxIndex = index;
        for (int i = index; i < nums.length; i++) {
            if (nums[i] > nums[index-1]) {
                if (nums[i] < restMax) {
                    restMax = nums[i];
                    resMaxIndex = i;
                }
            }
        }

        int tmp = nums[index-1];
        nums[index-1] = nums[resMaxIndex];
        nums[resMaxIndex] = tmp;

        Arrays.sort(nums,index,nums.length);
    }
}
