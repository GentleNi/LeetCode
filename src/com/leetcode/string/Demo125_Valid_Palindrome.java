package com.leetcode.string;

/**
 * Created by GentleNi
 * Date 2018/12/11.
 */
public class Demo125_Valid_Palindrome {

    //A man, a plan, a canal: Panama
    public boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) left++;
            else if (!Character.isLetterOrDigit(s.charAt(right))) --right;
            else if (s.charAt(left) != s.charAt(right)) return false;
            else { ++left; --right; }
        }
        return true;
    }
}
