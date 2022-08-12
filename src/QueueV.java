// @ Circular queue operations in java

public class QueueV {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // @empty condition
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // @full condition
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // @enqueue
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("full queue");
                return;
            }
            // @ adding first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // @dequeue O(1)
        
        public static int remove() {

            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];

            // @single element

            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;

        }

        // @peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
       
        while (!q.isEmpty()) {

            System.out.println(q.peek());
            q.remove();

        }
    }
}
