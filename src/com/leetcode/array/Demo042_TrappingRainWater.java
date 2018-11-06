package com.leetcode.array;

/**
 * @Author GentleNi
 * @Date 2018-10-08 20:42
 **/

public class Demo042_TrappingRainWater {
    public static void main(String[] args) {

    }

    public static int trap(int[] height) {
        int length = height.length;
        int[] leftPeek = new int[length];
        int[] rightPeek = new int[length];

        for (int i = 1; i < length; i++) {
            leftPeek[i] = Math.max(leftPeek[i-1],height[i-1]);
        }

        for (int j = length-2; j >= 0; j--) {
            rightPeek[j] = Math.max(rightPeek[j+1],height[j+1]);
        }

        int area = 0;
        for (int k = 0; k < length; k++) {
            int minHeight = Math.min(leftPeek[k],rightPeek[k]);
            if (minHeight > height[k]) {
                area += minHeight - height[k];
            }
        }

        return area;
    }

}
