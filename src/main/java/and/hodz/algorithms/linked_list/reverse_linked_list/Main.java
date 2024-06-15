package and.hodz.algorithms.linked_list.reverse_linked_list;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode new_list = null;

        while(cur != null) {
            ListNode next_node = cur.next;
            cur.next = new_list;
            new_list = cur;
            cur = next_node;
        }

        return new_list;
    }
}
