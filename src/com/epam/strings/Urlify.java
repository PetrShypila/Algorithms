package com.epam.strings;

import java.util.Arrays;

public class Urlify {
    public static void main(String[] args) {
        final char[] str = {'a', 'b', ' ', 'c', 'd', 'e', 'f', ' ', ' ', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', ' ', ' ', 'r', ' ',
                            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', };
        doIt(str);
        System.out.println(Arrays.toString(str));
    }

    private static void doIt(char[] src) {
        int eos = 0;
        //Looking for current eos
        for (int i = 0; i < src.length; i++) {
            if (src[i] == 0) {
                eos = i - 1;
                break;
            }
        }

        for (int i = src.length - 1; i >= 0; i--) {
            final char c = src[eos--];
            if (c == ' ') {
                src[i--] = '0';
                src[i--] = '2';
                src[i] = '%';
            } else {
                src[i] = c;
            }
        }
    }
}