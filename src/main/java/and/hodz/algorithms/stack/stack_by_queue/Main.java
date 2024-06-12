package and.hodz.algorithms.stack.stack_by_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        MyStack ms = new MyStack();

        ms.push(1);
        ms.push(2);

        System.out.println(ms);

        System.out.println(ms.top());
        System.out.println(ms);
        System.out.println(ms.pop());
        System.out.println(ms);


        System.out.println("--------------------------------");


        StackByLinkedList mls = new StackByLinkedList();

        mls.push(1);
        mls.push(2);

        System.out.println(mls);


        System.out.println(mls.top());
        System.out.println(mls);
        System.out.println(mls.pop());
        System.out.println(mls);


        System.out.println("-------------------------------------");



        Queue<Integer>  q = new LinkedList<>();
        q.add(1);
        q.add(2);

        System.out.println(q);

        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }

        System.out.println(q);

    }
}
