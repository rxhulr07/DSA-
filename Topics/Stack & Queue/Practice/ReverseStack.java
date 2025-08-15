package Practice;
import java.util.*;

public class ReverseStack {

    // Push an element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int value) {
        if (s.isEmpty()) {
            s.push(value);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, value);
        s.push(top);
    }

    // Reverse the stack using recursion
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(3);
        s.push(4);

        reverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
