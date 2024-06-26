package and.hodz.theory.datastructures.linked_list.deep_copy;

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
