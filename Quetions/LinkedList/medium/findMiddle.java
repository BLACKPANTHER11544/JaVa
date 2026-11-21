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

    // t.c => O(n), s.c-> O(1)
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

    // t.c -> O(n/2) "basically actual Asymptotic time compleixty is O(n), but if
    // counting number of execution(time complexity) then it's O(n/2)" and s.c ->
    // O(1).
    private void middle1(findMiddle obj1) {
        if (obj1.head == null || obj1.head.next == null) {
            return;
        }
        Node slow = obj1.head;
        Node fast = obj1.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle value is " + slow.value);
    }

    public static void main(String[] args) {
        findMiddle obj1 = new findMiddle();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(3);
        obj1.insert(4);
        obj1.insert(5);
        // obj1.insert(6);
        obj1.display();
        obj1.middle1(obj1);
    }
}
