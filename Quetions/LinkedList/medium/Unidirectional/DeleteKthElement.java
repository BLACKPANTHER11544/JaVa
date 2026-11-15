package Quetions.LinkedList.medium.Unidirectional;

public class DeleteKthElement {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        Node next;
        int value;

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

    private void deleteFirstNode() {
        head = head.next;
        size--;
    }

    private void deleteLastNode() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    private void DeleteNode(int index) {
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
        DeleteKthElement ob1 = new DeleteKthElement();
        ob1.insert(6);
        ob1.insert(5);
        ob1.insert(4);
        ob1.insert(3);
        ob1.insert(2);
        ob1.insert(1);
        ob1.display();
        ob1.deleteFirstNode();
        ob1.display();
        ob1.deleteLastNode();
        ob1.display();
        ob1.DeleteNode(2);
        ob1.display();
    }
}
