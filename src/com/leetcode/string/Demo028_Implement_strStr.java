package com.leetcode.string;

/**
 * Created by GentleNi
 * Date 2018/12/12.
 */
public class Demo028_Implement_strStr {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi","pi"));

    }
    //do myself : 好蠢呀。。。
    public static int strStr(String haystack, String needle) {
        if ("".equals(needle))
            return 0;
        int len = haystack.length();
        int j = 0;
        int index = 0;//第一次匹配位置
        for (int i = 0; i < len; i++) {
            if (haystack.charAt(i) != needle.charAt(0))
                continue;
            index = i;
            //首字母相等
            for ( j = 0; j < needle.length();i++,j++) {
                if (i > len-1) return -1;
                if (haystack.charAt(i) != needle.charAt(j)) {
                    i = index;
                    break;
                }
                else if (j == needle.length()-1){
                    return i - j;
                }

            }

        }
        return -1;
    }

    //暴力解法
    public int strStr2(final String haystack, final String needle) {
        if (needle.isEmpty()) return 0;

        final int N = haystack.length() - needle.length() + 1;
        for (int i = 0; i < N; i++) {
            int j = i;
            int k = 0;
            while (j < haystack.length() && k < needle.length() &&
                    haystack.charAt(j) == needle.charAt(k)) {
                j++;
                k++;
            }
            if (k == needle.length()) return i;
        }
        return -1;
    }
}
