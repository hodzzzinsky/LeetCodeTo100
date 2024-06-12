package and.hodz.algorithms.stack.daily_temp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DailyTepm {


    public static void main(String[] args) {
        int[] tmps = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(tmps)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Map<Integer, Integer>> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {

            while(!stack.isEmpty() && temperatures[i] > stack.peek().get(i)) {
                Map<Integer, Integer> pop = stack.pop();
                result[pop.get(temperatures[i])] = ( i - temperatures[i]);
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(temperatures[i], i);
            stack.push(map);
        }

        return result;

    }
}
//[1,1,4,2,1,1,0,0]