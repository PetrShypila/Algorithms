package com.epam.lists;

class Node {
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node() {}

    Node next;
    int data;

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
