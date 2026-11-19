package Quetions.LinkedList.medium;

public class ReverseUnidirectionalLL {
    private Node head;
    private Node tail;
    private int size;

    ReverseUnidirectionalLL() {
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

    private void reverse() {
        Node prev = null;
        Node temp;
        Node front = null;
        temp = head;
        while (temp != null) {
            front = temp.next; // to store the next node
            temp.next = prev; // store prev in temp.next
            prev = temp; //
            temp = front;
        }
        head = tail;
        tail = head;
    }

    public static void main(String[] args) {
        ReverseUnidirectionalLL obj1 = new ReverseUnidirectionalLL();
        obj1.insertLast(1);
        obj1.insertLast(2);
        obj1.insertLast(3);
        obj1.insertLast(4);
        obj1.insertLast(5);
        obj1.display();
        obj1.reverse();
        obj1.display();
    }
}
