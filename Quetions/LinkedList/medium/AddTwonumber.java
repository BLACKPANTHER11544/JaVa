package Quetions.LinkedList.medium;

public class AddTwonumber {
    private Node head;
    private Node tail;
    private int size;

    AddTwonumber() {
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

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("size:" + size);
    }

    private static int numbers(AddTwonumber obj) {
        Node temp = obj.head;
        int sum = 0;
        while (temp != null) {
            sum = (sum * 10) + temp.value;
            temp = temp.next;
        }
        return sum;
    }

    private static int reverse(int number) {
        int sum = 0;
        while (number > 0) {
            int rem = number % 10;
            sum = (sum * 10) + rem;
            number = number / 10;
        }
        return sum;
    }

    private static void makeList(int number) {
        AddTwonumber ob3 = new AddTwonumber();
        while (number > 0) {
            int rem = number % 10;
            ob3.insertLast(rem);
            number = number / 10;
        }
        ob3.display();
    }

    private static AddTwonumber AddNumbers(AddTwonumber L1, AddTwonumber L2) {
        AddTwonumber result = new AddTwonumber();
        Node head1 = L1.head;
        Node head2 = L2.head;
        int carry = 0;
        while (head1 != null || head2 != null || carry > 0) {
            int sum = carry;
            if (head1 != null) {
                sum = sum + head1.value;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum = sum + head2.value;
                head2 = head2.next;
            }
            int digit = sum % 10;
            carry = sum / 10;
            result.insertLast(digit);
        }
        return result;
    }

    // reasons why this is not working correctly => below
    /*
     * 1. data overflow, as linked list can be huge numbers, hence converting LL to
     * int/int data type can do data overflow.
     * 2. Not using the node's directly hence unnecessary reverse operations
     */

    // public static void main(String[] args) {
    // AddTwonumber ob1 = new AddTwonumber();
    // ob1.insertLast(5);
    // ob1.insertLast(4);
    // ob1.display();
    // AddTwonumber ob2 = new AddTwonumber();
    // ob2.insertLast(4);
    // ob2.display();
    // int sum1 = reverse(numbers(ob1));
    // int sum2 = reverse(numbers(ob2));
    // int result = sum1 + sum2;
    // System.out.print("reverse1->" + sum1 + " " + "reverse2->" + sum2 + " " +
    // "result->" + result);
    // makeList(result);
    // }

    public static void main(String[] arggs) {
        AddTwonumber ob1 = new AddTwonumber();
        ob1.insertLast(5);
        ob1.insertLast(4);
        ob1.display();
        AddTwonumber ob2 = new AddTwonumber();
        ob2.insertLast(4);
        ob2.display();
        AddTwonumber ob3 = AddNumbers(ob1, ob2);
        ob3.display();
    }

}