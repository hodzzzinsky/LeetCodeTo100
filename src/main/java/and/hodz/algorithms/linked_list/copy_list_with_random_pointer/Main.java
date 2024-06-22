package and.hodz.algorithms.linked_list.copy_list_with_random_pointer;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        four.random = one;
        three.next = four;
        three.random = one;
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

        Map<ListNode, Integer> map = new HashMap<>();
        int index = 0;
        while (dummy != null) {
            map.put(dummy, index);
            dummy = dummy.next;
            index++;
        }

        dummy = head;
        while (dummy != null) {
            if (dummy.random != null) {
                Integer integer = map.get(dummy.random);
            }
            dummy = dummy.next;

        }


        dummy = head;
        index = 0;
        Map<Integer, ListNode> rev = new HashMap<>();
        while (dummy != null) {
            curr.next = new ListNode(dummy.val);
            rev.put(index, curr.next);
            dummy = dummy.next;
            curr = curr.next;
            index++;
        }


        dummy = head;
        ListNode temp = fake;
        curr = temp;


        while (temp != null && dummy != null) {
            if(dummy.random != null) {
                curr.next.random = rev.get(map.get(dummy.random));
            }
            temp = temp.next;
            dummy = dummy.next;
            curr = curr.next;
        }
        return fake.next;
    }

}
