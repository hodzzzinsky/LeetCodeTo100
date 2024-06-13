package and.hodz.algorithms.linked_list;

public class Main {
    public static void main(String[] args) {

        ListNode tail1 = new ListNode(4 ,null);
        ListNode two1 = new ListNode(2, tail1);
        ListNode head1 = new ListNode(1, two1);


        ListNode tail2 = new ListNode(4, null);
        ListNode three = new ListNode(3, tail2);
        ListNode head2 = new ListNode(1, three);


        System.out.println(mergeTwoLists(head1, head2));

    }




    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }

        cur.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    public ListNode mergeTwoListsUsingRecursion(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return (list1 != null) ? list1 : list2;
        }

        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
    }
}
