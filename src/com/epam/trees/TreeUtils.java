package com.epam.trees;

class TreeUtils {
    static Node createBst(int[] a, int start, int fin) {
        if(start > fin) {
            return null;
        } else {
            int mid = (start+fin)/2;
            Node root = new Node(a[mid]);
            root.left = createBst(a, start, mid-1);
            root.right = createBst(a, mid+1, fin);

            return root;
        }
    }
}
