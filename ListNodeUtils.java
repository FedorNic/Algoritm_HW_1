package Home_Tasks.HT_18;

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

}

public class ListNodeUtils {
    public static void main(String[] args) {

        ListNodeUtils myList = new ListNodeUtils();

        myList.addFirst(12);
        myList.addFirst(26);
        myList.addFirst(3);
        myList.addFirst(52);
        ListNode all = myList.addFirst(32);
        myList.display();
        myList.reverse();
        myList.display();
        myList.removeFirst(all);
        myList.display();
        myList.removeFirst(all);
        myList.display();
        myList.removeFirst(all);
        myList.display();
    }

    public ListNode head;

    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public ListNode addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head != null) {
            node.next = this.head;
        }
        this.head = node;
        return node;
    }

    public ListNode removeFirst(ListNode node) {
        if (this.head != null) {
            this.head = head.next;
        }
        return node;
    }

    public void reverse() {
        ListNode prev = null;
        ListNode current = this.head;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev;
    }
}