package and.hodz.algorithms.stack.min_stack;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class MinStack {

    private int capacity = 0;
    private int[] array = new int[capacity];

    public MinStack() {
    }

    public void push(int val) {
        int[] targetArray = new int[++capacity];

        if (array.length > 0) {
            System.arraycopy(array, 0, targetArray, 1, array.length);
            array = targetArray;
            targetArray[0] = val;
        } else {
            array = targetArray;
            targetArray[0] = val;
        }
    }

    public void pop() {
        int[] targetArray = new int[--capacity];
        System.arraycopy(array, 1, targetArray, 0, array.length - 1);
        array = targetArray;
    }

    public int top() {
        return array[0];
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }


    @Override
    public String toString() {
        return "MinStack{" +
                "capacity=" + capacity +
                ", array=" + Arrays.toString(array) +
                '}';
    }

}
