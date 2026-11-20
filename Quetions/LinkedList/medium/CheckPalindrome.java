package Quetions.LinkedList.medium;

public class CheckPalindrome {
    private Node head;
    private int size;

    CheckPalindrome() {
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

    private int[] reserve(CheckPalindrome obj1) {
        if (obj1.head == null || obj1.head.next == null) {
            return new int[] { obj1.head.value };
        }

        Node temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        temp = head;
        int i = 0;
        int[] arr = new int[length];
        while (temp != null) {
            arr[i] = temp.value;
            i++;
            temp = temp.next;
        }
        return arr;
    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("size:" + size);
    }

    private boolean check(CheckPalindrome obj1) {

        if (obj1.head == null || obj1.head.next == null) {
            return true;
        }

        Node slow = obj1.head;
        Node fast = obj1.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node curr = slow;

        while (curr != null) {
            Node front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        Node first = obj1.head;
        Node second = prev;

        while (second != null) {
            if (first.value != second.value) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }

    private Node makeReverse(CheckPalindrome obj1) {
        if (obj1.head == null || obj1.head.next == null) {
            return head;
        }
        Node front = null;
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        CheckPalindrome obj1 = new CheckPalindrome();
        obj1.insert(1);
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(1);

        obj1.display();
        // obj1.makeReverse(obj1);
        System.out.println("The Linked List " + obj1.check(obj1) + " palindrome");
        obj1.display();
    }
}

/*
 * 123
 * 
 * 321 false
 * 
 * 
 * 121
 * 121
 * true
 * 
 * 
 */