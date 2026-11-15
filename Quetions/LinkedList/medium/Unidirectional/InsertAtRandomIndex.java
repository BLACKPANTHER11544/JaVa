package Quetions.LinkedList.medium.Unidirectional;

public class InsertAtRandomIndex {
    private Node head;
    private Node tail;
    private int size;

    InsertAtRandomIndex() {
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;

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

    private void insertTail(int n) {
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

    private void InsertAtRandom(int index, int X) {
        if (index == 0) {
            inserthead(X);
            return;
        }
        if (index == size) {
            insertTail(X);
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(X);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public static void main(String[] args) {
        InsertAtRandomIndex ob1 = new InsertAtRandomIndex();
        ob1.inserthead(6);
        ob1.inserthead(5);
        ob1.inserthead(4);
        ob1.inserthead(3);
        ob1.inserthead(2);
        ob1.inserthead(1);
        ob1.display();
        ob1.insertTail(8);
        ob1.display();
        ob1.InsertAtRandom(3, 9);
        ob1.display();
    }
}
