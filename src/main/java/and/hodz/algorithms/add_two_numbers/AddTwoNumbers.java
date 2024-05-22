package and.hodz.algorithms.add_two_numbers;

import java.util.Stack;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(addTwoNumbers(l1, l2));

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head = new ListNode(0);
        ListNode l3 = dummy_head;


        int carry = 0;
        while(l1 != null || l2 != null) {
            int l1_val = l1 != null ? l1.val : 0;
            int l2_val = l2 != null ? l2.val : 0;

            int sum = l1_val + l2_val + carry;

            carry = sum / 10;
            int last_digit = sum % 10;

            ListNode new_node = new ListNode(last_digit);
            l3.next = new_node;


            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            l3 = l3.next;   
        }

        if (carry > 0 ) {
            ListNode additional = new ListNode(carry);
            l3.next = additional;
            l3 = l3.next;
        }

        return dummy_head.next;
    }

    public static int sum(int sum, Stack<Integer> buffer) {
        if (sum / 10 < 1) {
            if (!buffer.isEmpty()) return sum + buffer.pop();
            else return sum;
        } else {
            buffer.push(sum/10);
            return 0;
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
