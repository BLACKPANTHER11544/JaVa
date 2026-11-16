package Quetions.LinkedList.medium.Bidirectional;

public class ArraytoDD {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        Node next;
        Node previous;
        int value;

        Node(int n) {
            this.value = n;
        }

        Node(int n, Node prev, Node next) {
            this.value = n;
            this.previous = prev;
            this.next = next;
        }
    }

    private void insertHead(int n) {
        Node temp = new Node(n);
        temp.next = head;
        temp.previous = null;
        if (head != null) {
            head.previous = temp;
        }
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

    // private void InsertLast(int n) {
    // Node temp = head;
    // while (temp.next.next != null) {
    // temp = temp.next;
    // }
    // Node newNode = new Node(n);
    // newNode.previous = temp.next;
    // temp.next.next = newNode;
    // newNode.next = null;
    // tail = newNode;
    // if (tail == null) {
    // tail = head;
    // }
    // size++;
    // }

    private void InsertLast(int n) {

        Node newNode = new Node(n);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }

        size++;
    }

    private static ArraytoDD convert(int[] arr) {
        ArraytoDD ob1 = new ArraytoDD();
        for (int i = 0; i < arr.length; i++) {
            ob1.InsertLast(arr[i]);
        }
        return ob1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        ArraytoDD converted = convert(arr);
        converted.display();
    }

}
