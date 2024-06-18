package and.hodz.algorithms.linked_list.intersection_of_two_linked_lists;

public class ListNode {
    int val;
    and.hodz.algorithms.linked_list.lincked_list_cycle.ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, and.hodz.algorithms.linked_list.lincked_list_cycle.ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {
    }
}

