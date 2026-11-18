package Quetions.LinkedList.medium;

public class SegregateOddAndEven {
    private Node head;
    private Node tail;
    private int size;

    SegregateOddAndEven() {
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

    private void insertLast(int n) {
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

    private void insertTail(int n) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node nn = new Node(n);
        temp.next = nn;
        nn.prev = temp;
        nn.next = null;
        tail = temp;
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

    private void putAtCorrectPlace() {
        SegregateOddAndEven obnew = new SegregateOddAndEven();
        Node temp = head;
        while (temp != null) {
            if (temp.value % 2 == 0) {
                obnew.insertLast(temp.value);
            }
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.value % 2 != 0) {
                obnew.insertTail(temp.value);
            }
            temp = temp.next;
        }
        obnew.display();
    }

    // t.c-> O(n^2) , s.c -> O(n)
    /*
     * t.c -> O(n^2) => because, in putAtCorrectPlace the outer while loop will run
     * for O(n), and the object.insertLast/insertTail will run for O(n) times as
     * well
     * hence total t.c-> O(n^2).
     * s.c-> O(n) => beacuse we're making a new object obnew
     */
    public static void main(String[] args) {
        SegregateOddAndEven ob1 = new SegregateOddAndEven();
        ob1.insertLast(1);
        ob1.insertLast(2);
        ob1.insertLast(3);
        ob1.insertLast(4);
        ob1.insertLast(5);
        ob1.insertLast(6);
        ob1.display();
        ob1.putAtCorrectPlace();
    }

}
