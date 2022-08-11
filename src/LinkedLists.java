public class LinkedLists {
    Node head;
    private int size;

    LinkedLists() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // @add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // @add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // @add print
    public void print() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println(" NULL");

    }

    // @delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List empty");
            return;
        }
        size--;
        head = head.next;
    }

    // @delete last
    public void deleteLast() {

        if (head == null) {
            System.out.println("List empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

    // @size
    public int getSize() {
        return size;
    }

    // @reverse a link list
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;

        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // @update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node revRec(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = revRec(head.next);

        // head.next.next = head;
        // ?OR
        Node headNext = head.next;
        headNext.next = head;

        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {

        LinkedLists list = new LinkedLists();

        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("e");
        list.print();
        list.head = list.revRec(list.head);
        list.print();
    }
}
