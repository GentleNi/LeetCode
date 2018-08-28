package com.leetcode.array;

import java.util.HashSet;

/**
 * @Author GentleNi
 * @Date 2018-08-28 20:21
 *
 * solution:
 * 我们在判断某个数的连续序列时，会分别往减小和增大的方向找下一个连续数在不在数组中。那么我们如何判断我们要寻找的下一个数在不在数组中呢？
 * 我们可以先建立一个HashSet，先用HashSet消除数组中的重复元素(相同的两个数只能使连续序列的长度+1)，然后查找HashSet中是否包含我们要寻找
 * 的下一个元素，包含则长度+1，继续往下寻找，不包含则这个寻找方向就没办法继续了。最后把两个方向的长度加起来即为包含该数的一个连续序列。
 **/

public class LongestConsecutiveSequence128 {

    public static void main(String[] args) {
        int [] nums =  {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length ==0)
            return 0;
        final HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int longest = 0;
        for (int i : nums) {
            int length = 1;
            for (int j = i-1; set.contains(j); j--) {
                set.remove(j); //remove是因为，对于每一个i，前后都找到了一个连续的序列，所以这个序列已经对其他的数字没有意义了。
                ++length;
            }

            for (int j = i+1; set.contains(j); j++) {
                set.remove(j);
                ++length;
            }

            longest = Math.max(length,longest);
        }
        return longest;
    }
}
