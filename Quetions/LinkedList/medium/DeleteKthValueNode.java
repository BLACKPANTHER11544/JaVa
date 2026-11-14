package Quetions.LinkedList.medium;

public class DeleteKthValueNode {
    private Node head;
    private Node tail;
    private int size;

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

    private void insert(int n) {
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

    private void deleteNodewithValue(int X) {
        if (head == null) {
            return;
        }
        if (head.value == X) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.value != X) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        size--;
    }

    public static void main(String[] args) {
        DeleteKthValueNode ob1 = new DeleteKthValueNode();
        ob1.insert(6);
        ob1.insert(5);
        ob1.insert(4);
        ob1.insert(3);
        ob1.insert(2);
        ob1.insert(1);
        ob1.display();
        ob1.deleteNodewithValue(4);
        ob1.display();
    }

}
