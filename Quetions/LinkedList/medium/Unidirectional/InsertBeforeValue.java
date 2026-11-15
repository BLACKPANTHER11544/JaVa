package Quetions.LinkedList.medium.Unidirectional;

public class InsertBeforeValue {
    private Node head;
    private Node tail;
    private int size;

    InsertBeforeValue() {
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

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("size:" + size);
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

    private void insertByValue(int insert, int before) {
        Node temp = head;
        while (temp.next.value != before) {
            temp = temp.next;
        }
        Node newNode = new Node(insert);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public static void main(String[] args) {
        InsertBeforeValue ob1 = new InsertBeforeValue();
        ob1.insertHead(6);
        ob1.insertHead(5);
        ob1.insertHead(4);
        ob1.insertHead(3);
        ob1.insertHead(2);
        ob1.insertHead(1);
        ob1.display();
        ob1.insertTail(8);
        ob1.display();
        ob1.insertByValue(9, 4);
        ob1.display();
    }
}
