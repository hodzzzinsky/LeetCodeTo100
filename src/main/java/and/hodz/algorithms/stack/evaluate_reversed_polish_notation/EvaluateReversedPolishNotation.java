package and.hodz.algorithms.stack.evaluate_reversed_polish_notation;

import java.util.Stack;

public class EvaluateReversedPolishNotation {


    public static void main(String[] args) {
        String[] tokens  = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(evalRPN(tokens));
    }


    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        int a = 0;
        int b = 0;
        for (String token : tokens) {
            if (token.equals("+")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(a + b);
            }
            else if (token.equals("*")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(a * b);
            }
            else if (token.equals("-")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(b - a);
            }
            else if (token.equals("/")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(b / a);
            } else
                stack.push(Integer.parseInt(token));

        }

        return stack.pop();
    }
}
