package Quetions.LinkedList.medium.Bidirectional;

public class DeleteTail {
    private Node head;
    private Node tail;
    private int size;

    DeleteTail() {
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

    private void DT() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    private void InsertHead(int n) {
        Node temp = new Node(n);
        temp.next = head;
        temp.prev = null;
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

    public static void main(String[] args) {
        DeleteTail ob1 = new DeleteTail();
        ob1.InsertHead(6);
        ob1.InsertHead(5);
        ob1.InsertHead(4);
        ob1.InsertHead(3);
        ob1.InsertHead(2);
        ob1.InsertHead(1);
        ob1.display();
        ob1.DT();
        ob1.display();
    }

}
