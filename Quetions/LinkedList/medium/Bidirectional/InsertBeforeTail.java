package Quetions.LinkedList.medium.Bidirectional;

public class InsertBeforeTail {
    private Node head;
    private Node tail;
    private int size;

    InsertBeforeTail() {
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

    private void inserthead(int n) {
        Node temp = new Node(n);
        temp.next = head;
        temp.prev = null;
        if (head != null) {
            head.prev = temp;
        }
        head = temp;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    private void beforeTail(int n) {

        if (head == null) {
            inserthead(n);
            return;
        }

        if (head == tail) {
            Node nn = new Node(n);

            nn.next = head;
            head.prev = nn;
            head = nn;

            size++;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node nn = new Node(n);

        nn.prev = temp.prev;
        nn.next = temp;

        temp.prev.next = nn;
        temp.prev = nn;

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

    public static void main(String[] args) {
        InsertBeforeTail obj1 = new InsertBeforeTail();
        obj1.inserthead(6);
        obj1.inserthead(5);
        obj1.inserthead(4);
        obj1.inserthead(3);
        obj1.inserthead(2);
        obj1.inserthead(1);
        obj1.display();
        obj1.beforeTail(9);
        obj1.display();
    }

}
