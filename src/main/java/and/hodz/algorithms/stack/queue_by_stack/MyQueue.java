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
        while(!main.isEmpty()) {
            Integer pop = main.pop();

            if (element == main.size() - 1) res =  pop;
            else sub.push(pop);
            element++;
        }
        main = (Stack<Integer>) sub.clone();
        sub.clear();
        return res;
    }

    public int peek() {
        int element = 0;
        while(!main.isEmpty()) {
            element = main.pop();
            sub.push(element);
        }
        main = (Stack<Integer>) sub.clone();
        sub.clear();
        return element;
    }

    public boolean empty() {
       return main.isEmpty();
    }


    @Override
    public String toString() {
        return main.toString();
    }
}
