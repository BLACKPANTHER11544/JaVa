package Quetions.LinkedList.medium;

public class IntersectingNode {
    private Node head;
    private int size;

    IntersectingNode() {
        this.size = 0;
    }

    private class Node {
        Node next;
        int value;

        Node(int n) {
            this.value = n;
        }
    }

    private void Insert(int n) {
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

    // t.c -> O(nm) , s.c-> O(1);
    private int find(IntersectingNode obj1, IntersectingNode obj2, int skipObj1, int skipObj2) {
        if (obj1.head == null || obj2.head == null || obj1.head.next == null || obj2.head.next == null) {
            return -1;
        } else if (skipObj1 == -1 || skipObj2 == -1) {
            return -1;
        }
        if (obj1.head == null || obj2.head == null) {
            return -1;
        }
        Node temp1 = obj1.head;
        while (temp1 != null) {
            Node temp2 = obj2.head;
            while (temp2 != null) {
                if (temp1.value == temp2.value) {
                    return temp1.value;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        IntersectingNode obj1 = new IntersectingNode();
        obj1.Insert(1);
        obj1.Insert(2);
        obj1.Insert(3);
        obj1.Insert(4);
        obj1.Insert(5);
        obj1.display();
        IntersectingNode obj2 = new IntersectingNode();
        obj2.Insert(7);
        obj2.Insert(8);
        obj2.Insert(4);
        obj2.Insert(5);
        obj2.display();
        int ans = obj1.find(obj1, obj2, 3, 2);
        System.out.println(ans);
    }
}
