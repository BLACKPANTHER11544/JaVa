package Quetions.LinkedList.medium.Unidirectional;

public class DeleteTail {
    private Node head;
    private Node tail;
    private int size;

    DeleteTail() {
        this.size = 0;
    }

    private class Node {
        Node next;
        int value;

        Node(int n) {
            this.value = n;
        }

        Node() {
            this.value = 0;
        }

        Node(int n, Node node) {
            this.value = n;
            this.next = node;
        }
    }

    private void InserStart(int n) {
        Node nextNode = new Node(n);
        nextNode.next = head;
        head = nextNode;
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
        System.out.println("size: " + size);
    }

    private void deleteLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    public static void main(String[] args) {
        DeleteTail ob1 = new DeleteTail();
        ob1.InserStart(3);
        ob1.InserStart(2);
        ob1.InserStart(1);
        ob1.display();
        ob1.deleteLast();
        ob1.display();
    }
}
