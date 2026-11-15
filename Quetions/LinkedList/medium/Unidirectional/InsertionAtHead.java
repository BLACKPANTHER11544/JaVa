package Quetions.LinkedList.medium.Unidirectional;

public class InsertionAtHead {
    private Node head;
    private Node tail;
    private int size;

    InsertionAtHead() {
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

    private void insertathead(int n) {
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
        System.out.println("size: " + size);

    }

    public static void main(String[] args) {
        InsertionAtHead ob1 = new InsertionAtHead();
        ob1.insertathead(6);
        ob1.insertathead(5);
        ob1.insertathead(4);
        ob1.insertathead(3);
        ob1.insertathead(2);
        ob1.insertathead(1);

        ob1.display();
    }

}
