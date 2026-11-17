package Quetions.LinkedList.medium.Bidirectional;

public class InsertBeforeValue {
    private Node head;
    private Node tail;
    private int size;

    InsertBeforeValue() {
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
    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("size:" + size);
    }

    private void insertbeforevalue(int n, int before) {
        if (head.value == before) {
            Node temp = new Node(n);
            temp.next = head;
            temp.prev = null;
            head.prev = temp;
            head = temp;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.value != before) {
            temp = temp.next;
        }
        if (temp.next == null && temp.value != before) {
            return;
        }
        Node nn = new Node(n);
        nn.next = temp;
        nn.prev = temp.prev.next;
        temp.prev.next = nn;
        temp.prev = nn;
        size++;
        return;
    }

    public static void main(String[] args) {
        InsertBeforeValue obj1 = new InsertBeforeValue();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(3);
        obj1.insert(4);
        obj1.insert(5);
        obj1.insert(6);
        obj1.display();
        obj1.insertbeforevalue(9, 4);
        obj1.display();
    }
}
