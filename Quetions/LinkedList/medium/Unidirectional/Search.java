package Quetions.LinkedList.medium.Unidirectional;

public class Search {
    private Node head;
    private Node tail;
    private int size;

    Search() {
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

    private boolean searchElement(int n) {
        if (head == null) {
            return false;
        }
        Node temp = head;
        while (temp != null && temp.value != n) {
            temp = temp.next;
        }
        if (temp == null) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Search ob = new Search();
        // ob.insertHead(6);
        // ob.insertHead(5);
        // ob.insertHead(4);
        // ob.insertHead(3);
        // ob.insertHead(2);
        // ob.insertHead(1);
        // ob.display();
        System.out.println(ob.searchElement(10));
    }
}
