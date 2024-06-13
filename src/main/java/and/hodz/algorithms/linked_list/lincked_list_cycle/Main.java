package and.hodz.algorithms.linked_list.lincked_list_cycle;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ListNode minusFour = new ListNode(-4, null);
        ListNode zero = new ListNode(0, minusFour);
        ListNode two = new ListNode(2, zero);
        ListNode head = new ListNode(3, two);
        //minusFour.next = two;

        System.out.println(hasCycleByPointers(head));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        Set<Integer> set = new HashSet<>();
        while (head.next != null) {
            if (set.contains(head.hashCode())) return true;
            else {
                set.add(head.hashCode());
                head = head.next;
            }
        }
        return false;
    }

    public static boolean hasCycleByPointers(ListNode head) {
        if (head == null) return false;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
