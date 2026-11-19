package Quetions.LinkedList.medium;

public class DeleteMiddleNode {
    private Node head;
    private int size;

    DeleteMiddleNode() {
        this.size = 0;
    }

    private class Node {
        Node next;
        int value;

        Node(int n) {
            this.value = n;
        }
    }

    private void insert(int n) {
        Node temp = new Node(n);
        if (head == null) {
            head = temp;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = temp;
        }
        size++;
    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("size:" + size);
    }

    private void delete(DeleteMiddleNode obj1) {
        if (obj1.head == null || obj1.head.next == null) {
            return;
        }
        Node temp = obj1.head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int middle = (length / 2) + 1;
        int i = 1;
        temp = head;
        while (i < middle - 1 && temp.next.next != null) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }

    public static void main(String[] args) {
        DeleteMiddleNode obj1 = new DeleteMiddleNode();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(3);
        obj1.insert(4);
        obj1.insert(5);
        obj1.insert(6);
        obj1.display();
        obj1.delete(obj1);
        obj1.display();
    }
}
