package Quetions.LinkedList.medium;

public class RemoveDuplicate {
    private Node head;
    private Node tail;
    private int size;

    RemoveDuplicate() {
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

    private void insert(int n) {
        Node temp = new Node(n);
        if (head == null) {
            head = temp;
            tail = head;
        } else {
            tail.next = temp;
            temp.next = null;
            temp.prev = tail;
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

    private void delete() {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.value == temp.next.value) {
                Node nextNode = temp.next;
                temp.next = nextNode.next;
                if (nextNode.next != null) {
                    nextNode.next.prev = temp;
                } else {
                    tail = temp;
                }
                size--;
            } else {
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        RemoveDuplicate obj1 = new RemoveDuplicate();
        obj1.insert(1);
        obj1.insert(1);
        obj1.insert(1);
        obj1.insert(1);
        obj1.insert(1);
        obj1.insert(1);
        obj1.insert(3);
        obj1.insert(3);
        obj1.insert(4);
        obj1.insert(5);
        obj1.display();
        obj1.delete();
        obj1.display();
    }
}
