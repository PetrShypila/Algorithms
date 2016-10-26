package com.epam.trees;

public class BstChecker {
    public static void main(String[] args) {
        System.out.println(null == null);
        Node root = TreeUtils.createBst(new int[]{0,1,2,3,4,5,6,7,8,9,10}, 0, 10);

        System.out.println(isValidBst(root));
    }

    private static boolean isValidBst(Node root) {
        if(root == null) {
            return true;
        } else {
            boolean rootValid = branchValid(root.left, root) && branchValid(root, root.right);
            boolean leftValid = isValidBst(root.left);
            boolean rightValid = isValidBst(root.right);
            return rootValid && leftValid && rightValid;
        }

    }

    private static boolean branchValid(Node n1, Node n2) {
        return n1 == null || n2 == null || n1.data < n2.data;
    }
}
