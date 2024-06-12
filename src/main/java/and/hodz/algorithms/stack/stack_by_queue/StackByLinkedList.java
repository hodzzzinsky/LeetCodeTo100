package and.hodz.algorithms.stack.stack_by_queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackByLinkedList {

    private Queue<Integer> myQueue = new LinkedList<>();

    public StackByLinkedList() {
    }

    public void push(int x) {
        myQueue.add(x);
        for (int i = 0; i < myQueue.size() - 1; i++) {
            myQueue.add(myQueue.remove());
        }
        //reversed
    }

    public int pop() {
        return myQueue.remove();
    }

    public int top() {
        return myQueue.peek();
    }

    public boolean empty() {
        return myQueue.isEmpty();
    }

    @Override
    public String toString() {
        return myQueue.toString();
    }
}
