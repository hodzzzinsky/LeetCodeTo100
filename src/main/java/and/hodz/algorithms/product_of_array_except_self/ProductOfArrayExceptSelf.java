package and.hodz.algorithms.product_of_array_except_self;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};


        System.out.println(
                Arrays.toString(
                        solution(nums))
        );
    }

    public static int[] productExceptSelfTooSlow(int[] nums) {
        int[] list = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) continue;
                else sum = sum * nums[j];
            }
            list[counter++] = sum;
        }
        return list;
    }


    public static int[] solution(int[] nums) {
        int[] pref = new int[nums.length];
        int[] postf = new int[nums.length];
        var lCounter = 0;
        var rCounter = nums.length - 1;
        int i = nums.length - 1;
        int pref_sum = 1;
        int postf_sum = 1;
        for (int j = 0; j < nums.length; j++) {
            pref_sum *= nums[j];
            pref[lCounter++] = pref_sum;

            postf_sum *= nums[i--];
            postf[rCounter--] = postf_sum;
        }

        int[] res = new int[nums.length];
        int counter = 0;
        for (int x = 0; x < nums.length; x++) {
            int pref_val = 0;
            int postfix = 0;


            if (x == 0) {
                pref_val = 1;
                postfix = postf[x + 1];
            } else if (x == nums.length - 1) {
                pref_val = pref[x - 1];
                postfix = 1;
            } else {
                postfix = postf[x + 1];
                pref_val = pref[x - 1];
            }
            res[counter++] = pref_val * postfix;

        }
        return res;
    }

    public static int[] better(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];

        left[0] = 1;
        right[nums.length - 1] = 1;

        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for (int i = len - 2; len >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }


        for (int i = 0; i < len; i++) {
            nums[i] = left[i] * right[i];
        }
        return nums;
    }
}




