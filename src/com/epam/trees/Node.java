package com.epam.trees;

public class Node {
    public Node(int data) {
        this.data = data;
    }

    public Integer data;
    public Node left;
    public Node right;

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
