package Quetions.LinkedList.medium.Bidirectional;

public class InsertNodeAtKthIndex {
    private Node head;
    private Node tail;
    private int size;

    InsertNodeAtKthIndex() {
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

    private void insertKth(int index, int X) {
        Node temp = head;
        int i = 1;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        Node nn = new Node(X);
        nn.prev = temp.prev;
        nn.next = temp;
        temp.prev.next = nn;
        temp.prev = nn;
        size++;

    }

    private void insertlast(int n) {
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

    public static void main(String[] args) {
        InsertNodeAtKthIndex obj1 = new InsertNodeAtKthIndex();
        obj1.insertlast(1);
        obj1.insertlast(2);
        obj1.insertlast(3);
        obj1.insertlast(4);
        obj1.insertlast(5);
        obj1.insertlast(6);
        obj1.display();
        obj1.insertKth(4, 9);
        obj1.display();
    }
}

// 1 2 3 4 5 6
