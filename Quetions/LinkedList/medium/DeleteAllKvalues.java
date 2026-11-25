package Quetions.LinkedList.medium;

public class DeleteAllKvalues {
    private Node head;
    private Node tail;
    private int size;

    DeleteAllKvalues() {
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

    private void delete(DeleteAllKvalues obj1, int k) {
        if (obj1.head == null) {
            return;
        }
        Node temp = obj1.head;
        Node dummy = new Node(-1);
        Node TAIL = dummy;
        while (temp != null) {
            if (temp.value != k) {
                TAIL.next = temp;
                TAIL = temp;
            }
            temp = temp.next;
        }
        size--;
        head = dummy.next;
    }

    public static void main(String[] args) {
        DeleteAllKvalues obj1 = new DeleteAllKvalues();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(3);
        obj1.insert(1);
        obj1.insert(4);
        obj1.display();
        obj1.delete(obj1, 1);
        obj1.display();
    }
}
