import java.util.*;

//@Push at bottom of the stack
public class PushBottom {
    public static void pushAtBottom(int data, Stack<Integer> s) {

        if (s.isEmpty()) {
            s.push(data);
            //System.out.println("empty met");
            return;
        }
        int top = s.pop();
        //System.out.println("top value " + top);
        pushAtBottom(data, s);
        //System.out.println("push to stack");
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        // pushAtBottom(4, s);
        reverse(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
