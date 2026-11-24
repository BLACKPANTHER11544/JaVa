package Quetions.LinkedList.medium;

public class MergeTwoSortedLL {
    private Node head;
    private int size;

    MergeTwoSortedLL() {
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

    private void merge(MergeTwoSortedLL obj1, MergeTwoSortedLL obj2) {
        if (obj1.head == null) {
            head = obj2.head;
            return;
        }
        if (obj2.head == null) {
            head = obj1.head;
            return;
        }
        Node temp1 = obj1.head;
        Node temp2 = obj2.head;
        Node dummy = new Node(-1);
        Node tail = null;
        tail = dummy;
        while (temp1 != null && temp2 != null) {
            if (temp1.value <= temp2.value) {
                tail.next = temp1;
                temp1 = temp1.next;
            } else {
                tail.next = temp2;
                temp2 = temp2.next;
            }
            tail = tail.next;
        }
        if (temp1 != null) {
            tail.next = temp1;
        }
        if (temp2 != null) {
            tail.next = temp2;
        }
        head = dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLL obj1 = new MergeTwoSortedLL();
        obj1.insert(2);
        obj1.insert(4);
        obj1.insert(7);
        System.out.println("LL1 ->");
        obj1.display();
        MergeTwoSortedLL obj2 = new MergeTwoSortedLL();
        obj2.insert(1);
        obj2.insert(3);
        obj2.insert(5);
        obj2.insert(6);
        obj2.display();
        obj1.merge(obj1, obj2);
        obj1.display();
    }
}
