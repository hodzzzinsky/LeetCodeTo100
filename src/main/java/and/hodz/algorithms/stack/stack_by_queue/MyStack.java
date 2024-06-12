package and.hodz.algorithms.stack.stack_by_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MyStack {

    Deque<Integer> main = new ArrayDeque<>();
    Deque<Integer> sub = new ArrayDeque<>();

    public MyStack() {

    }

    public void push(int x) {
        main.push(x);
    }

    public int pop() {
        int result = 0;
        while (!main.isEmpty()) {

            Integer pop = main.pop();
            sub.push(pop);

        }
        while (!sub.isEmpty()) {
            main.push(sub.pop());
        }
        result = main.pop();
        return result;
    }

    public int top() {
        int result = 0;
        while (!main.isEmpty()) {
            sub.push(main.pop());
        }
        while (!sub.isEmpty()) {
            main.push(sub.pop());
        }
        if (!main.isEmpty()) result = main.peek();
        return result;
    }

    public boolean empty() {
        return main.isEmpty();
    }

    @Override
    public String toString() {
        return  main.toString();
    }
}
