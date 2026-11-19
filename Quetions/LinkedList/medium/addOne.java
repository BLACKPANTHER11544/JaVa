package Quetions.LinkedList.medium;

public class addOne {
    private Node head;
    private int size;

    addOne() {
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
            System.out.print(temp.value + " - > ");
            temp = temp.next;
        }
        System.out.println("size:" + size);
    }

    private void reverse(addOne obj1) {
        if (obj1.head == null || obj1.head.next == null) {
            return;
        }
        Node temp = obj1.head;
        Node front = null;
        Node prev = null;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        obj1.head = prev;
    }

    private void Add(addOne obj1) {
        Node temp = obj1.head;
        int carry = 1;
        while (temp != null && carry > 0) {
            int sum = temp.value + carry;
            int digit = sum % 10;
            temp.value = digit;
            carry = sum / 10;
            if (temp.next == null && carry > 0) {
                temp.next = new Node(carry);
                carry = 0;
                size++;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addOne ob1 = new addOne();
        ob1.insert(1);
        ob1.insert(2);
        ob1.insert(3);
        System.out.println("Original LL");
        ob1.display();
        ob1.reverse(ob1);
        System.out.println("1st reversal");
        ob1.display();
        ob1.Add(ob1);
        System.out.println("Added 1");
        ob1.display();
        ob1.reverse(ob1);
        System.out.println("2nd reversal");
        ob1.display();
    }
}
