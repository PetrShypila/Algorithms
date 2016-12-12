package com.epam.lists;

public class PartitionList {
    public static void main(String[] args) {
        final Node tail = ListUtils.builtLinkedFromArray();
        Node temp = tail;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        temp = partition(tail, 10);
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    private static Node partition(Node tail, int val) {
        Node temp = tail;

        while(temp != null) {
            if(temp.data < val) {
                Node n = temp;
                temp = temp.next;
                n.next = tail;
                tail = n;
            }
        }

        return tail;
    }
}
