package Quetions.LinkedList.medium;

public class ReverseUniLL {

    private Node head;
    private Node tail;
    private int size;

    ReverseUniLL() {
        this.size = 0;
    }

    private class Node {
        Node next;
        int value;

        Node(int n) {
            this.value = n;
        }
    }

    private void insertLast(int n) {
        Node temp = new Node(n);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.next = null;
            tail = temp;
        }
    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("size:" + size);
    }

    private void revese() {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = head;
        int length = 0;
        while (temp.next.next != null) {
            temp = temp.next;
            length++;
        }
        int i = 1;
        temp = head;
        while (i <= length) {
            head = tail;
            tail.next = temp;
            tail = temp;
            temp = temp.next;
            i++;

        }
    }

    // this ain't working as, in this we haven't disconnected the last nodes next
    // connection.
    // t.c-> O(n), s.c-> O(1);
    public static void main(String[] args) {
        ReverseUniLL obj1 = new ReverseUniLL();
        obj1.insertLast(1);
        obj1.insertLast(2);
        obj1.insertLast(3);
        obj1.insertLast(4);
        obj1.insertLast(5);
        obj1.display();
        obj1.revese();
        obj1.display();
    }
}