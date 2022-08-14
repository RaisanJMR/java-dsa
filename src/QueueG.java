import java.util.*;

// @ Queue using two stack

public class QueueG {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty() {
        System.out.println(s1.isEmpty() + " Checking empty condition");
        return s1.isEmpty();
    }

    // @ Empty
    public static void add(int data) {
        while (!s1.isEmpty()) {

            System.out.println(!s1.isEmpty() + " " + data + " pop from s1 and push to s2");
            s2.push(s1.pop());
        }
        System.out.println(s1.isEmpty() + " " + data + " push to s1");
        s1.push(data);

        while (!s2.isEmpty()) {
            System.out.println(s1.isEmpty() + " " + data + " pop from s2 and push to s1");
            s1.push(s2.pop());
        }

    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        return s1.pop();
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        return s1.peek();
    }

    public static void main(String[] args) {

        QueueG q = new QueueG();
        q.add(1);

        q.add(2);

        q.add(3);

        q.add(4);

        q.add(5);

        System.out.println("started printing");

        while (!q.isEmpty()) {

            System.out.println(q.peek());

            q.remove();

        }
    }
}