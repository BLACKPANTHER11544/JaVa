package Quetions.LinkedList.medium.Bidirectional;

public class ReverseLinkedList {
    private Node head;
    private Node tail;
    private int size;

    ReverseLinkedList() {
        this.size = 0;
    }

    private class Node {
        Node next;
        Node prev;
        int value;

        Node(int n) {
            this.value = n;
        }
    }

    private void insert(int n) {
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
        return;
    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("size:" + size);
    }

    private void reverse() {
        Node current = head;
        Node temp = null;
        while (current != null) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;
    }

    public static void main(String[] args) {
        ReverseLinkedList obj1 = new ReverseLinkedList();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(3);
        obj1.insert(4);
        obj1.insert(5);
        obj1.insert(6);
        obj1.display();
        obj1.reverse();
        obj1.display();
    }
}
