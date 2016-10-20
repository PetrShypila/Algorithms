package com.epam.trees;

public class TreePrinter {
    public static void printTree(Node n) {
        if(n == null) return;

        printTree(n.left);
        System.out.println(n.data);
        printTree(n.right);
    }
}
