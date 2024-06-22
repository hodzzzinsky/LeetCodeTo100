package and.hodz.algorithms.linked_list.copy_list_with_random_pointer;

public class ListNode {

    int val;
    ListNode next;
    ListNode random;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        var rv = random == null? null : random.val;
        return "[" + val + ", " + rv + "] -> " + next;
    }
}
