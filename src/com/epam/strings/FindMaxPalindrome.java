package com.epam.strings;

class FindMaxPalindrome {

    public static void main(String[] args) {
        final String s = "";
        System.out.println(FindMaxPalindrome.find(s));
    }

    static String find(String s) {
        String result = s.length() > 0 ? s.substring(0,1) : "";

        for(int i = 0; i<s.length(); i++) {
            String odd = findPalindrome(s, i, i);
            String even = findPalindrome(s, i, i+1);

            if(odd.length() > even.length() && odd.length() > result.length()) {
                result = odd;
            } else if(even.length() > odd.length() && even.length() > result.length()) {
                result = even;
            }
        }

        return result;
    }

    private static String findPalindrome(String s, int l, int r) {

        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--; r++;
        }

        return s.substring(l+1, r);
    }
}
