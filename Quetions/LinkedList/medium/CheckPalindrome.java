package Quetions.LinkedList.medium;

import java.util.List;
import java.util.ArrayList;

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

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("size" + size);
    }

    // t.c => O(n) , s.c => O(n), as we have used an ArrayList of size n;
    private boolean Check(CheckPalindrome obj1) {
        if (obj1.head == null || obj1.head.next == null) {
            return true;
        }
        // add linked-list elements into arraylist
        List<Integer> arr = new ArrayList<>();
        for (Node i = head; i != null; i = i.next) {
            arr.add(i.value);
        }
        // display
        System.out.println("");
        System.out.println("Elements in Arrays: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " -> ");
        }
        // check palindrome
        for (int i = 0; i < (arr.size()) / 2; i++) {
            if (arr.get(i) != arr.get(arr.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // t.c->O(n), s.c-> O(1)
    private boolean Check1(CheckPalindrome obj1) {
        if (obj1.head == null || obj1.head.next == null) {
            return true;
        }
        Node slow = obj1.head;
        Node fast = obj1.head;
        // runs n/2 times
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node temp = slow;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        Node second = prev;
        Node first = obj1.head;
        // runs n/2 times
        while (second != null) {
            if (first.value != second.value) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPalindrome obj1 = new CheckPalindrome();
        obj1.insert(1);
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(1);
        obj1.display();
        boolean ans = obj1.Check(obj1);
        System.out.println("");
        System.out.println("Above Linked List is " + ans + " palindrome");
    }
}