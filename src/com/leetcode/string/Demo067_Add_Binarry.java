package com.leetcode.string;

/**
 * Created by GentleNi
 * Date 2018/12/12.
 */
public class Demo067_Add_Binarry {

    public static void main(String[] args) {
        System.out.println(addBinary("10010","111"));
    }
    public static String addBinary(String a, String b) {
        if (a.isEmpty())
            return b;
        if (b.isEmpty())
            return a;
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder result = new StringBuilder();
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int valA = i >= 0 ? a.charAt(i--) - '0':0;
            int valB = j >= 0 ? b.charAt(j--) - '0':0;
            int sum = valA + valB + carry;
            result.insert(0,(sum % 2 ) + "");
            carry = sum / 2;
        }

        return result.toString();
    }

}
