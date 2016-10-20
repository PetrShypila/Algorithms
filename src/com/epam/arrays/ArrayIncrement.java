package com.epam.arrays;

public class ArrayIncrement {

    public static int[] increment(int[] num) {

        for(int i = num.length-1; i>= 0; i--) {
            if(num[i] != 9) {
                final int[] incremented = new int[num.length];

                System.arraycopy(num, 0, incremented, 0, i);
                incremented[i] = num[i] + 1;

                return incremented;
            }
        }

        final int[] newArray = new int[num.length+1];
        newArray[0] = 1;
        return newArray;
    }
}
