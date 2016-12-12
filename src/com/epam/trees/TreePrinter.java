package com.epam.trees;

import java.util.*;

public class TreePrinter {
    public static void printTreeAscending(Node n) {
        if(n == null) return;

        printTreeAscending(n.left);
        System.out.println(n.data);
        printTreeAscending(n.right);
    }

    public static void printTreeLayers(Node root) {
        Queue<Node> firstLayer = new LinkedList<>();
        Queue<Node> secondLayer = new LinkedList<>();

        firstLayer.add(root);
        while(!firstLayer.isEmpty()) {
            for(Node n: firstLayer) {
                if(n.left != null) secondLayer.add(n.left);
                if(n.right != null) secondLayer.add(n.right);
                if(n.data != null) System.out.printf("%d ", n.data);
            }
            System.out.println();
            firstLayer.clear();
            firstLayer.addAll(secondLayer);
            secondLayer.clear();
        }
    }
}
