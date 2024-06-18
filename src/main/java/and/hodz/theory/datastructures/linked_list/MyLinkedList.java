package and.hodz.theory.datastructures.linked_list;

class MyLinkedList {

    public static class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    private Node head;


    public MyLinkedList() {

    }

    public MyLinkedList(int val) {
        head = new Node(val, null);
    }

    public MyLinkedList(int val, MyLinkedList next) {
        head = new Node(val, next.head);
    }


    public int get(int index) {
        Node cur = head;
        int start = 0;

        while (start <= index && cur != null) {
            if (start == index) return cur.val;
            cur = cur.next;
            start++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        head = new Node(val, head);
    }

    public void addAtTail(int val) {
        Node cur = head;
        if (cur == null) {
            head = new Node(val, null);
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(val, null);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node cur = head;
        int start = 0;
        while (cur != null && start < index - 1) {
            cur = cur.next;
            start++;
        }
        if (cur == null) return;
        cur.next = new Node(val, cur.next);
    }

    public void deleteAtIndex(int index) {
        if (index < 0) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node cur = head;
        int start = 0;
        while (cur != null && start < index - 1) {
            cur = cur.next;
            start++;
        }
        if (cur == null || cur.next == null) return;
        cur.next = cur.next.next;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "val=" + head.val +
                ", next=" + head.next +
                '}';
    }
}
