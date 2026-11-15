package Quetions.LinkedList.medium.Unidirectional;

public class FindLength {
    private Node head;
    private Node tail;
    private int size;

    FindLength() {
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

    private void insertHead(int n) {
        Node temp = new Node(n);
        temp.next = head;
        head = temp;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    private int length() {
        Node temp = head;
        int length = 0;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        return length;
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
        FindLength ob = new FindLength();
        ob.insertHead(6);
        ob.insertHead(5);
        ob.insertHead(4);
        ob.insertHead(3);
        ob.insertHead(2);
        ob.insertHead(1);
        ob.display();
        System.out.println(ob.length());
    }
}
