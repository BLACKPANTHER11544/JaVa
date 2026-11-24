package Quetions.LinkedList.medium;

import java.util.Map;
import java.util.HashMap;

public class DetectLoop {
    private Node head;
    private Node tail;
    private int size;

    DetectLoop() {
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
            tail = temp;
            tail.next = head;
            head.prev = tail;
        }
        size++;
    }

    private void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
        System.out.println("size: " + size);
    }

    // t.c -> o(n), O(n)
    private Node check(DetectLoop obj1) {
        if (obj1.head == null || obj1.head.next == null) {
            return obj1.head;
        }
        Map<Node, Integer> count = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            if ((count.containsKey(temp))) {
                return temp;
            } else if (!(count.containsKey(temp))) {
                count.put(temp, count.getOrDefault(temp, 0) + 1);
            }
            temp = temp.next;
        }
        return null;
    }

    public static void main(String[] args) {
        DetectLoop obj1 = new DetectLoop();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(3);
        obj1.insert(4);
        obj1.display();
        obj1.check(obj1);
        Node ans = obj1.check(obj1);
        System.out.println("Loop detected at: " + ans.value);
    }
}
