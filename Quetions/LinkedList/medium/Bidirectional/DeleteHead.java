package Quetions.LinkedList.medium.Bidirectional;

public class DeleteHead {
    private Node head;
    private Node tail;
    private int size;

    DeleteHead() {
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

    private void InsertLast(int n) {
        Node temp = new Node(n);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            temp.next = null;
            tail = temp;
        }
        size++;
    }

    private void DH() {
        if (head == null || head.next == null) {
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
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
        DeleteHead obj1 = new DeleteHead();
        obj1.InsertLast(1);
        obj1.InsertLast(2);
        obj1.InsertLast(3);
        obj1.InsertLast(4);
        obj1.InsertLast(5);
        obj1.display();
        obj1.DH();
        obj1.display();
    }
}
