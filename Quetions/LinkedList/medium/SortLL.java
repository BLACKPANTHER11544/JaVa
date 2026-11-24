package Quetions.LinkedList.medium;

import java.util.ArrayList;
import java.util.Collections;

public class SortLL {
    private Node head;
    private int size;

    SortLL() {
        this.size = 0;
    }

    private class Node {
        Node next;
        int value;

        Node(int n) {
            this.value = n;
        }
    }

    private void insert(int n) {
        Node temp = new Node(n);
        if (head == null) {
            head = temp;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = temp;
        }
        size++;
    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("size:" + size);
    }

    private void sort(SortLL obj1) {
        if (obj1.head == null || obj1.head.next == null) {
            return;
        }
        Node temp = head;
        ArrayList<Integer> result = new ArrayList<>();
        while (temp != null) {
            result.add(temp.value);
            temp = temp.next;
        }
        Collections.sort(result);
        Node dummy = new Node(-1);
        Node tail = dummy;
        for (int i = 0; i < result.size(); i++) {
            Node t1 = new Node(result.get(i));
            tail.next = t1;
            tail = t1;
        }
        head = dummy.next;
    }

    public static void main(String[] args) {
        SortLL obj1 = new SortLL();
        obj1.insert(4);
        obj1.insert(2);
        obj1.insert(7);
        obj1.insert(3);
        obj1.insert(9);
        obj1.display();
        obj1.sort(obj1);
        obj1.display();
    }
}
