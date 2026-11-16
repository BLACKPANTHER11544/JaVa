package Quetions.LinkedList.medium.Bidirectional;

public class DeleteNodeByValue {
    private Node head;
    private Node tail;
    private int size;

    DeleteNodeByValue() {
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

    private void DVN(int n) {
        Node temp = head;
        while (temp.next != null || temp.next.value != n) {
            if (temp.value == n) {
                if (temp.prev == null) {
                    head = temp.next;
                } else {
                    temp.prev.next = temp.next;
                }
                if (temp.next == null) {
                    tail = temp.prev;
                } else {
                    temp.next.prev = temp.prev;
                }
                size--;
                return;
            }
            temp = temp.next;
        }

    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("size: " + size);
    }

    public static void main(String[] args) {
        DeleteNodeByValue obj1 = new DeleteNodeByValue();
        obj1.insertLast(2);
        obj1.insertLast(3);
        obj1.insertLast(4);
        obj1.insertLast(5);
        obj1.insertLast(5);
        obj1.display();
        obj1.insertHead(1);
        obj1.display();
        obj1.DVN(1);
        obj1.display();
    }
}
