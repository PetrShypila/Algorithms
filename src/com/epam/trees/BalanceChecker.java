package com.epam.trees;

public class BalanceChecker {
    public static void main(String[] args) {
        Node root = TreeUtils.createBst(new int[]{0,1,2,3,4,5,6,7,8,9,10}, 0, 10);
        System.out.println(isTreeBalanced(root));
    }

    static boolean isTreeBalanced(Node root) {
        final Node imba = new Node(13);
        imba.right = new Node(15);

        root.right.right.right.right = imba;
        int diff = Math.abs(calculateDepth(root.left, 1) - calculateDepth(root.right, 1));
        return diff < 2;
    }

    private static int calculateDepth(Node root, int depth){
        if(root == null) return depth;
        depth++;
        int leftDepth = calculateDepth(root.left, depth);
        int rightDepth = calculateDepth(root.right, depth);

        return Math.max(leftDepth, rightDepth);
    }
}
