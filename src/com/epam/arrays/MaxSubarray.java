package com.epam.arrays;

public class MaxSubarray {

    public static void printMaxSubarray(int[] a) {
        final int n = a.length;
        int aStart = 0;
        int aFin = aStart;
        int maxSum = a[aStart];

        for(int i = 0; i < n; i++){
            int sum = a[i];

            for(int j = i+1; j < n; j++) {
                if(a[j] < 0 && sum > maxSum) {
                    maxSum = sum;
                    aStart = i;
                    aFin = j-1;
                }

                sum += a[j];

                if(j == n-1 && sum > maxSum) {
                    maxSum = sum;
                    aStart = i;
                    aFin = j;
                }

                if(sum < 0) {
                    i = j-1;
                    break;
                }
            }
        }

        System.out.printf("%d - %d", aStart, aFin);
    }
}
