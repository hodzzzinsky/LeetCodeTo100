package and.hodz.theory.datastructures.linked_list.deep_copy;

public class Main {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        //four.random = two;
        three.next = four;
       // three.random = one;
        two.next = three;
        two.random = four;
        one.next = two;


        System.out.println(one);
        ListNode fake = deepCopy(one);
        System.out.println(fake);
    }

    private static ListNode deepCopy(ListNode head) {
        ListNode dummy = head;
        ListNode fake = new ListNode(-1);
        ListNode curr = fake;
        while(dummy != null) {
            curr.next = new ListNode(dummy.val);
            if(dummy.random != null) curr.random = new ListNode(dummy.random.val);
            dummy = dummy.next;
            curr = curr.next;
        }
        return fake.next;
    }

}
