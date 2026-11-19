package Quetions.LinkedList.medium;

public class findMiddle {
    private Node head;
    private int size;

    findMiddle() {
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
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("size:" + size);
    }

    private void middle(findMiddle obj1) {
        if (head == null || head.next == null) {
            return;
        }
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int middle = (length / 2) + 1;

        int i = 1;
        temp = head;
        while (i < middle && temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println("Middle value => " + temp.value);
    }

    public static void main(String[] args) {
        findMiddle obj1 = new findMiddle();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(3);
        obj1.insert(4);
        obj1.insert(5);
        obj1.insert(6);
        obj1.display();
        obj1.middle(obj1);
    }
}
