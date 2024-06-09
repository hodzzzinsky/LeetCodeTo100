package and.hodz.algorithms.unfinished.rotate_array;

import java.util.*;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        rotate3(nums, 7);
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        Deque<Integer> list = new LinkedList<>();
        for (int i = nums.length - k; i < nums.length; i++) {
            list.push(nums[i]);
        }

        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);

        int index = 0;
        for (int i = k; i < nums.length; i++) {
            nums[i] = copy[index++];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = list.removeLast();
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void rotate2(int[] nums, int k) {
        if (k > nums.length) {
            int c = k/nums.length;
            int t = nums.length * c;
            k = k - t;
        }
        if(nums.length <= 1) k = 0;

        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);

        int after = 0;
        int before = nums.length - k;

        for (int i = k; i < nums.length; i++) {
            nums[i] = copy[after++];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = copy[before++];
        }

        System.out.println(Arrays.toString(nums));

    }


    public static void rotate3(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0 , nums.length - 1);
        reverse(nums, 0 , k - 1);
        reverse(nums, k , nums.length - 1);

        System.out.println(Arrays.toString(nums));


    }

    private static void reverse(int [] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

}
