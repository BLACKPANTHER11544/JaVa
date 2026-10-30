package Quetions.Recursion.medium;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    // t.c -> O(n^2) s.c-> O(n)
    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }

    public static void insertAtBottom(Stack<Integer> stk, int top) {
        if (stk.isEmpty()) {
            stk.push(top);
            return;
        }
        int high = stk.pop();
        insertAtBottom(stk, top);
        stk.push(high);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.addAll(Arrays.asList(4, 1, 3, 2));
        ReverseStack.reverseStack(stk);
        System.out.print(stk);
    }
}
