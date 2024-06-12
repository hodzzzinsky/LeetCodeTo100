package and.hodz.algorithms.stack.queue_by_stack;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> main = new Stack<>();
    Stack<Integer> sub = new Stack<>();

    public MyQueue() {}

    public void push(int x) {
        main.push(x);
    }

    public int pop() {
        int res = 0;
        int element = 0;
        int size = main.size();
        while(!main.isEmpty()) {
            Integer pop = main.pop();

            if (element == size - 1) res =  pop;
            else sub.push(pop);
            element++;
        }
        while (!sub.isEmpty()) {
            main.push(sub.pop());
        }
        return res;
    }

    public int peek() {
        int res = 0;
        int element = 0;
        int size = main.size();
        while(!main.isEmpty()) {
            Integer pop = main.pop();

            if (element == size - 1) res =  pop;
            sub.push(pop);
            element++;
        }
        while (!sub.isEmpty()) {
            main.push(sub.pop());
        }
        return res;
    }

    public boolean empty() {
       return main.isEmpty();
    }


    @Override
    public String toString() {
        return main.toString();
    }
}
