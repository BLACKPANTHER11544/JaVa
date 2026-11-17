package Quetions.LinkedList.medium.Bidirectional;

public class InsertAtHead {
    private Node head;
    private Node tail;
    private int size;

    InsertAtHead() {
        this.size = 0;
    }

    private class Node {
        Node next;
        Node prev;
        int value;

        Node(int n) {
            this.value = n;
        }

        Node(int n, Node next, Node prev) {
            this.value = n;
            this.next = next;
            this.prev = prev;
        }
    }

    private void insertStart(int n) {
        Node temp = new Node(n);
        temp.next = head;
        temp.prev = null;
        head = temp;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("size:" + size);
    }

    public static void main(String[] args) {
        InsertAtHead obj1 = new InsertAtHead();
        obj1.insertStart(6);
        obj1.insertStart(5);
        obj1.insertStart(4);
        obj1.insertStart(3);
        obj1.insertStart(2);
        obj1.insertStart(1);
        obj1.display();
    }

}
