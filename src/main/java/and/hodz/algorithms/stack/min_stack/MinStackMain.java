package and.hodz.algorithms.stack.min_stack;

public class MinStackMain {

    public static void main(String[] args) {
        MinStackByNode stack = new MinStackByNode();


        stack.push(22);
        stack.push(11);
        stack.push(33);
        stack.push(1);
        System.out.println(stack);
        stack.pop();
        int min = stack.getMin();
        System.out.println(min);


    }



}
