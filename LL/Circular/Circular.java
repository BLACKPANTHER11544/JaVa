package LL.Circular;

public class Circular {
    Node head;
    Node tail;
    int size;

    Circular() {
        this.size = 0;
    }

    private class Node {
        Node next;
        Node previous;
        int value;

        Node(int Value) {
            this.value = Value;
        }

        Node(Node Next, Node Previous, int Value) {
            this.next = Next;
            this.previous = Previous;
            this.value = Value;
        }
    }

    private void display() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    // Insert at Start
    private void InsertStartNode(int n) {
        Node temp = head;
        if (head == null) {
            head = tail;
        }
        Node newNode = new Node(n);
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.previous = temp;
    }

    public static void main(String[] args) {
        Circular obj = new Circular();
        obj.InsertStartNode(1);
        obj.InsertStartNode(2);
        obj.InsertStartNode(3);
        System.out.println();
        obj.display();
    }
}
