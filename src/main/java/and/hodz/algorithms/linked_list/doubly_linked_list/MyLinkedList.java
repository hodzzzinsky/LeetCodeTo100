package and.hodz.algorithms.linked_list.doubly_linked_list;

class MyLinkedList {

    public static class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", prev=" + prev +
                    ", next=" + next +
                    '}';
        }
    }

    Node head;


    public MyLinkedList() {
    }

    public MyLinkedList(int val) {
        head = new Node(val, null, null);
    }

    public MyLinkedList(int val, Node prev, Node next) {
        head = new Node(val, prev, next);
    }




    public int get(int index) {
        if(index < 0) return - 1;
        if(head == null) return - 1;
        Node cur = head;

        int i = 0;
        while (i <= index && cur != null) {
            if(i == index) return cur.val;
            cur = cur.next;
            i++;
        }


        return -1;
    }

    public void addAtHead(int val) {
        head = new Node(val, head.prev, head);
    }

    public void addAtTail(int val) {
        if(head == null) head = new Node(val, null, null);
        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        Node ins = new Node(val, head, null);
        head.next = ins;
        head = ins;
//        head = new Node(val, head, null);
    }

    public void addAtIndex(int index, int val) {
        int i = 0;
        Node cur = head;

        while(i <= index && cur != null) {
            if(index == i) {
                if(cur.prev == null) addAtHead(val);
                else if(cur.next == null) addAtTail(val);
                else {
                    Node ins = new Node(val, cur.prev, cur);
                    cur.prev.next = ins;
                    cur.prev = ins;
                }

            }
            cur = cur.next;
            i++;


        }




    }

    public void deleteAtIndex(int index) {
        if(head == null) return;
        int i = 0;
        Node cur = head;

        while (i <= index && cur != null) {
            if(i == index) {
                if(cur.prev != null) cur.prev.next = cur.next;
                if(cur.next != null) cur.next.prev = cur.prev;
            }
            cur = cur.next;
            i++;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}