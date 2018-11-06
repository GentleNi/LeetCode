package com.leetcode.array;

/**
 * @Author GentleNi
 * @Date 2018-09-25 18:58
 **/

public class Demo_283_MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3,4};
        moveZeroes(nums);
        for (int a : nums) {
            System.out.println(a);
        }
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length;i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }


        for (int j = index;j < nums.length;j++) {
            nums[j] = 0;
        }
    }
}
