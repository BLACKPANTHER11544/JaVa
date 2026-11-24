package Quetions.LinkedList.medium;

public class ReverseLLforKelement {
    private Node head;
    private int size;

    ReverseLLforKelement() {
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

    private Node getKthNode(Node head, int k) {
        if (k == -1 || head == null) {
            return null;
        }
        int i = 1;
        Node temp = head;
        while (i < k && temp != null) {
            i++;
            temp = temp.next;
        }
        return temp;
    }

    private Node reverse(Node head) {
        Node temp = head;
        Node prev = null;
        Node front = null;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    private Node reverseKth(ReverseLLforKelement obj1, int k) {
        if (obj1.head == null || k <= 1) {
            return obj1.head;
        }

        Node temp = head;
        Node previousLast = null;
        while (temp != null) {
            Node kthNode = getKthNode(temp, k);
            if (kthNode == null) {
                if (previousLast != null) {
                    previousLast.next = temp;
                }
                break;
            }
            Node nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if (temp == head) {
                head = kthNode;
            } else {
                previousLast.next = kthNode;
            }
            previousLast = temp;
            temp = nextNode;
        }
        return head;
    }

    public static void main(String[] args) {
        ReverseLLforKelement obj1 = new ReverseLLforKelement();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(3);
        obj1.insert(4);
        obj1.insert(5);
        obj1.insert(6);
        obj1.insert(7);
        obj1.insert(8);
        obj1.insert(9);
        obj1.insert(10);
        obj1.display();
        obj1.reverseKth(obj1, 3);
        obj1.display();
    }
}
