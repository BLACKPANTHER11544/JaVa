package Quetions.LinkedList.medium;

public class RotateByK {
    private Node head;
    private int size;

    RotateByK() {
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

    private void rotate(RotateByK obj1, int k) {
        if (obj1.head == null || obj1.head.next == null || k == 0) {
            return;
        }
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        k = k % length;
        if (k == 0) {
            return;
        }
        int startingPoint = length - k;
        temp = head;
        int i = 1;
        while (i < startingPoint) {
            i++;
            temp = temp.next;
        }
        Node newHead = temp.next;
        Node front = temp.next;
        temp.next = null;
        while (front.next != null) {
            front = front.next;
        }
        front.next = head;
        head = newHead;
    }

    public static void main(String[] args) {
        RotateByK obj1 = new RotateByK();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(3);
        obj1.insert(4);
        obj1.insert(5);
        obj1.display();
        obj1.rotate(obj1, 2);
        obj1.display();

    }

}