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

    public static void main(String[] args) {
        Circular obj = new Circular();
        obj.display();
    }
}
