package and.hodz.algorithms.linked_list.doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList one = new MyLinkedList(1, null, null);
        MyLinkedList two = new MyLinkedList(2, one.head, null);
        MyLinkedList three = new MyLinkedList(3, two.head, null);
        MyLinkedList four = new MyLinkedList(4, null, null);

//        one.head.next = two.head;
//        two.head.next = three.head;
//        three.head.next = four.head;

        System.out.println(one);

        one.addAtTail(2);

        System.out.println(one);
    }



}
