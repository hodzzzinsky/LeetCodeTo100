package and.hodz.algorithms.linked_list.remove_n_th_element_from_linked_list;

public class Main {
    public static void main(String[] args) {
        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);

        ListNode two = new ListNode(2, three );
        ListNode one = new ListNode(1, two);


        System.out.println(removeNthFromEnd(one, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
