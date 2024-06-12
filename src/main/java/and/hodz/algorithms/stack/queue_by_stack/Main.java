package and.hodz.algorithms.stack.queue_by_stack;

public class Main {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();

        // TODO: WARNING !!! UNFINISHED
        mq.push(3);
        mq.push(4);

        System.out.println(mq);
        mq.pop();

        System.out.println(mq);
        System.out.println(mq.empty());
        mq.push(5);
        System.out.println(mq);
        System.out.println(mq.peek());
        System.out.println(mq);
    }
}
