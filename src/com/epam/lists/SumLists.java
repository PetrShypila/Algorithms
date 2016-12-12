package com.epam.lists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumLists {
    public static void main(String[] args){
        final List<Integer> first = Arrays.asList(7,1,6);
        final List<Integer> second = Arrays.asList(5,9,2);

        System.out.println(sumLists(first, second));
    }

    private static LinkedList<Integer> sumLists(List<Integer> first, List<Integer> second) {
        final LinkedList<Integer> result = new LinkedList<>();
        int depth = 0;

        for(int i = 0; i < first.size(); i++) {
            int sum = first.get(i) + second.get(i) + depth;
            result.add(sum % 10);
            depth = sum / 10;
        }

        return result;
    }
}
