package LL.Bidirectional;

public class Bidirectional {
    private Node head;
    private Node tail;
    private int size;

    Bidirectional() {
        this.size = 0;
    }

    private class Node {
        int value;
        Node previous;
        Node next;

        Node(int n) {
            this.value = n;
        }

        Node(int n, Node Previous, Node Next) {
            this.value = n;
            this.previous = Previous;
            this.next = Next;
        }

    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    // Insert Node at start
    private void InsertFisrt(int n) {
        Node newNode = new Node(n);
        newNode.next = head;
        newNode.previous = null;
        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert Node at Last
    private void InsertLast(int n) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(n);
        temp.next.next = newNode;
        newNode.previous = temp.next;
        newNode.next = null;
        size++;

    }

    // Insert Node at random
    private void InsertNodeRandom(int n, int index) {
        Node temp = head;
        if (index == 0) {
            InsertFisrt(n);
        } else if (index == size) {
            InsertLast(n);
        } else if (index < 0 || index > size) {
            System.out.println("Can't Insert Outside Range");
        } else {
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            Node newNode = new Node(n);
            newNode.previous = temp;
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public static void main(String[] args) {
        Bidirectional obj = new Bidirectional();
        // obj.InsertFisrt(7);
        obj.InsertFisrt(9);
        obj.InsertFisrt(4);
        obj.InsertFisrt(5);
        obj.InsertFisrt(7);
        obj.display();
        obj.InsertLast(8);
        System.out.println();
        obj.display();
        obj.InsertLast(8);
        obj.InsertNodeRandom(100, 1);
        System.out.println();
        obj.display();
    }
}
