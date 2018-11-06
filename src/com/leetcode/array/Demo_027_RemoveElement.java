package com.leetcode.array;

/**
 * @Author GentleNi
 * @Date 2018-09-25 18:43
 **/

public class Demo_027_RemoveElement {

    public static void main(String[] args) {
        int[] a = {1,2,2,2,5};
        System.out.println(removeElement(a,2));
        for(int i : a){
            System.out.println(i);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
