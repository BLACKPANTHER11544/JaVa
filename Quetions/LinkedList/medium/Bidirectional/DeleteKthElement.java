package Quetions.LinkedList.medium.Bidirectional;

public class DeleteKthElement {
    private Node head;
    private Node tail;
    private int size;

    DeleteKthElement() {
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

    private void insertHead(int n) {
        Node temp = new Node(n);
        temp.next = head;
        temp.prev = null;
        head = temp;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    private void insertLast(int n) {
        Node temp = new Node(n);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.prev = tail;
            tail.next = temp;
            temp.next = null;
            tail = temp;
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

    private void DeleteHead() {
        if (head == null || head.next == null) {
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    private void DeleteTail() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        temp.prev = tail;
        tail = temp;
        size--;
    }

    private void DN(int n) {
        int length = 1;
        Node temp = head;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        if (n == 1) {
            DeleteHead();
        } else if (n == length) {
            DeleteTail();
        }
        int i = 1;
        temp = head;
        while (i < n - 1) {
            temp = temp.next;
            i++;
        }
        temp.next.next.prev = temp.next;
        temp.next = temp.next.next;
        size--;
    }

    public static void main(String[] args) {
        DeleteKthElement obj1 = new DeleteKthElement();
        obj1.insertLast(2);
        obj1.insertLast(3);
        obj1.insertLast(4);
        obj1.insertLast(5);
        obj1.insertLast(6);
        obj1.display();
        obj1.insertHead(1);
        obj1.display();
        obj1.DN(4);
        obj1.display();
    }
}
