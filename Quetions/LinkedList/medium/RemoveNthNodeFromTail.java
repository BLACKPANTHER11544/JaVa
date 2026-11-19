package Quetions.LinkedList.medium;

public class RemoveNthNodeFromTail {
    private Node head;
    private Node tail;
    private int size;

    RemoveNthNodeFromTail() {
        this.size = 0;
    }

    private class Node {
        Node next;
        int value;

        Node(int n) {
            this.value = n;
        }
    }

    private void insertLast(int n) {
        Node temp = new Node(n);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.next = null;
            tail = temp;
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

    private void removeNthNode(int index) {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        temp = head;
        if (index == length) {
            head = head.next;
            return;
        }
        int remove = length - index;
        temp = head;
        int i = 1;
        while (i < remove) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromTail obj1 = new RemoveNthNodeFromTail();
        obj1.insertLast(5);
        obj1.insertLast(4);
        obj1.insertLast(3);
        obj1.insertLast(2);
        obj1.insertLast(1);
        obj1.display();
        obj1.removeNthNode(5);
        obj1.display();
    }
}