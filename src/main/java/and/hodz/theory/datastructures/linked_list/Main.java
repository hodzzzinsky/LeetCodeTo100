package and.hodz.theory.datastructures.linked_list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(1);
        ll.addAtTail(2);

        System.out.println(ll);
        ll.addAtIndex(1, 3);

        System.out.println(ll);

        ll.deleteAtIndex(1);

        System.out.println(ll);
        ll.addAtHead(4);

        System.out.println(ll);
    }
}
