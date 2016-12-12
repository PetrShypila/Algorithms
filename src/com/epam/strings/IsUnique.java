package com.epam.strings;

public class IsUnique {

    public static void main(String[] args){
        final String s = "asdfghjakl";
        System.out.println(isUnique(s));
    }

    private static boolean isUnique(String s) {
        final int asciiSize = 128;

        if(s.length() > asciiSize) {
            return false;
        } else {
            final String lower = s.toLowerCase();
            final boolean[] uniqueIndecies = new boolean[asciiSize];

            for(int i = 0; i < lower.length(); i++) {
                if(uniqueIndecies[lower.charAt(i)]) return false;
                uniqueIndecies[lower.charAt(i)] = true;
            }
        }

        return true;
    }
}
