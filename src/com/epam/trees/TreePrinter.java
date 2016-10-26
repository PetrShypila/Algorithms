package com.epam.trees;

public class TreePrinter {
    public static void main(String[] args) {
        Node root = TreeUtils.createBst(new int[]{0,1,2,3,4,5,6,7,8,9,10}, 0, 10);
        printTree(root);
    }

    static void printTree(Node n) {
        if(n == null) return;

        printTree(n.left);
        System.out.println(n.data);
        printTree(n.right);
    }


}
