package Quetions.LinkedList.medium;

public class DeleteHead {
    private Node head;
    private Node tail;
    private int size;

    DeleteHead() {
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

    private void InsertFisrt(int n) {
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
        System.out.println("End");
    }

    // Delete Head Node and Add Another head there .
    private void DeleteFirstHead(int n) {
        Node nextNode = new Node(n);
        nextNode.next = head.next;
        head = nextNode;
        if (tail == null) {
            tail = head;
        }

    }

    // Delete Head node only.
    private void deletehead() {
        head = head.next;
        size--;
    }

    public static void main(String[] args) {
        DeleteHead Ob1 = new DeleteHead();
        // adding some nodes ;
        Ob1.InsertFisrt(3);
        Ob1.InsertFisrt(2);
        Ob1.InsertFisrt(1);
        Ob1.display();
        System.out.println("size: " + Ob1.size);
        // Delete head node and add another head node there.
        Ob1.DeleteFirstHead(5);
        Ob1.display();
        System.out.println("size: " + Ob1.size);
        Ob1.deletehead();
        Ob1.display();
        System.out.println("size: " + Ob1.size);
    }
}
