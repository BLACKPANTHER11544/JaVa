package LL.Unidirectional;

class Unidirectional {
    private Node head;
    private Node tail;
    private int size;

    Unidirectional() {
        this.size = 0;
    }

    private class Node {

        int value;

        Node next;

        Node(int n) {
            this.value = n;
        }

        Node(int n, Node node) {
            this.value = n;
            this.next = node;
        }
    }

    // Insert Node at beginning
    private void InsertFisrt(int n) {
        Node newNode = new Node(n);
        newNode.next = head;
        head = newNode;
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
        System.out.print("End");
    }

    // Insert Node at last
    private void insertLast(int n) {
        Node temp = head;
        while (!(temp.next == null)) {
            temp = temp.next;
        }
        Node newNode = new Node(n);
        newNode.next = null;
        temp.next = newNode;
        size++;
    }

    // Insert Node at Random index ;
    private void insertRandom(int n, int index) {
        if (index == 0) {
            InsertFisrt(n);
            return;
        }
        if (index == size) {
            insertLast(n);
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(n);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Delete Node from Start
    private void deleteFirstNode() {
        head = head.next;
        size--;
    }

    // Delete Node from Last
    private void deleteLastNode() {
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    // Delete Node from Random index
    private void deleteRandomNode(int index) {
        if (index == 0) {
            deleteFirstNode();
            return;
        }
        if (index == size) {
            deleteLastNode();
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }

    public static void main(String[] args) {
        Unidirectional obj = new Unidirectional();
        obj.InsertFisrt(5);
        obj.InsertFisrt(6);
        obj.InsertFisrt(7);
        obj.display();
        System.out.println();
        obj.insertLast(8);
        obj.insertLast(9);
        obj.insertLast(10);
        obj.insertLast(11);
        obj.display();
        System.out.println();
        obj.insertRandom(50, 4);
        obj.display();
        obj.deleteFirstNode();
        System.out.println();
        obj.display();
        System.out.println();
        obj.deleteLastNode();
        obj.display();
        System.out.println();
        obj.deleteRandomNode(3);
        obj.display();
    }
}