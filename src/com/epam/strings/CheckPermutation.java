package com.epam.strings;

import java.util.Arrays;

public class CheckPermutation {
    public static boolean isPermutated(String src, String perm) {
        if(src.length() != perm.length()) {
            return false;
        } else {
            final int n = src.length();
            final String srcLower = src.toLowerCase();
            final String permLower = perm.toLowerCase();
            final int[] srcMap = new int[src.length()];
            final int[] permMap = new int[perm.length()];

            for(int i = 0; i < n; i++) {
                srcMap[src.charAt(i)]++;
                permMap[perm.charAt(i)]++;
            }

            return Arrays.equals(srcMap, permMap);
        }
    }
}
