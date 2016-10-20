package com.epam;

import com.epam.trees.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n13 = new Node(13);
        Node n15 = new Node(15);
        Node n17 = new Node(17);

        n10.left = n5;
        n5.left = n3;
        n3.left = n1;
        n1.left = n0;
        n7.left = n6;
        n15.left = n13;

        n10.right = n15;
        n15.right = n17;
        n5.right = n7;
        n7.right = n8;
        n8.right = n9;
        n3.right = n4;
        n1.right = n2;

        TreePrinter.printTree(n10);
    }
}
