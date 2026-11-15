package Quetions.LinkedList.medium.Unidirectional;

public class InsertAtTail {
    private Node head;
    private Node tail;
    private int size;

    InsertAtTail() {
        this.size = 0;
    }

    private class Node {
        Node next;
        int value;

        Node(int n) {
            this.value = n;
        }

        Node(int n, Node node) {
            this.value = n;
            this.next = node;
        }
    }

    private void inserthead(int n) {
        Node temp = new Node(n);
        temp.next = head;
        head = temp;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    private void insertAtTail(int n) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(n);
        temp.next = newNode;
        newNode.next = null;
        tail = newNode;
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

    public static void main(String[] args) {
        InsertAtTail ob1 = new InsertAtTail();
        ob1.inserthead(6);
        ob1.inserthead(5);
        ob1.inserthead(4);
        ob1.inserthead(3);
        ob1.inserthead(2);
        ob1.inserthead(1);
        ob1.display();
        ob1.insertAtTail(8);
        ob1.display();
    }
}
