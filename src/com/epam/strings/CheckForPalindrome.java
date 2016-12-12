package com.epam.strings;

public class CheckForPalindrome {
    public static void main(String[] args) {
        final String s = "Nasdaggn";
        System.out.println(doIt(s));
    }

    private static boolean doIt(String src) {
        final int[] map = new int[128]; //ascii
        final String srcLower = src.toLowerCase();

        for(int i = 0; i < srcLower.length(); i++) {
            map[srcLower.charAt(i)]++;
        }

        boolean containsOdd = false;

        for(int i = 97; i < 123; i++) { // lower letters from ascii table only
            if(map[i] % 2 == 1) {
                containsOdd = !containsOdd;
                if(!containsOdd) {
                    return false;
                }
            }
        }

        return true;
    }
}
