package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author GentleNi
 * @Date 2018-08-29 20:14
 **/

public class TwoSum001 {

    public static void main(String[] args) {
        int[] nums = {2,7,9,11};
        System.out.println(twoSum(nums,9));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            final Integer v = numMap.get(target - nums[i]);
            if (v != null && v > i) {
                return new int[]{i+1, v+1};
            }
        }
        return null;
    }
}
