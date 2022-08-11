public class RemFromEnd {
    public ListNode removeFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        int size = 0;
        ListNode curr = head;
        while (curr != head) {
            curr = curr.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {

    }
}
// // IF LIST WITH 1 ELEMENT
// if(head.next==null)return null;

// // FINDING THE LENGTH OF LIST.
// int length = getLen(head);
// // LENGTH - N -1 TIMES WE WILL MOVE STORING IT IN H.
// int h = length - n;

// // CREATING TEMPORARY NODE TEMP
// ListNode temp = head;

// // IF WE HAVE TO REMOVE A HEAD
// if(length==n)
// {
//     head = head.next;
//     return head;
// }
// // NOW MOVE TEMP FOR H-1 TIMES
// for(
// int i = 0;i<h-1&&temp.next!=null;i++)
// {
//     temp = temp.next;
// }
// // CHECK FOR NULL POINTER EXCEPTION
// if(temp.next!=null)
// {
//     temp.next = temp.next.next;
// }
// // FINALLY RETURN THE HEAD.
// return head;
// }

// // FUNCTION TO FIND THE LENGTH OF LINKED LIST
// public int getLen(ListNode head){
//         ListNode temp = head;
//         int x =0;
//         while(temp != null){
//             temp = temp.next;
//             x++;
//         }
//         return x;
//     }