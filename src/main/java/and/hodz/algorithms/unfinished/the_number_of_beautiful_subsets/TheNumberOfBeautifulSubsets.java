package and.hodz.algorithms.unfinished.the_number_of_beautiful_subsets;

import java.util.HashMap;

public class TheNumberOfBeautifulSubsets {
    public static void main(String[] args) {
        System.out.println(beautifulSubsets1(new int[]{2, 4, 6}, 2));
    }


    public static int beautifulSubsets(int[] nums, int k) {
        int count = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j >= 0; j--) {
                if (nums[j] - nums[i] > k) {

                    count++;
                }
            }
        }
        return count;
    }


    public static int beautifulSubsets1(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans = dfs(nums, 0, k, mp);
        return ans - 1;
    }

    private static int dfs(int[] nums, int idx, int k, HashMap<Integer, Integer> mp) {
        if (idx == nums.length) return 1;

        int taken = 0;
        if (!mp.containsKey(nums[idx] - k) && !mp.containsKey(nums[idx] + k)) {
            mp.put(nums[idx], mp.getOrDefault(nums[idx], 0) + 1);
            taken = dfs(nums, idx + 1, k, mp);
            mp.put(nums[idx], mp.get(nums[idx]) - 1);
            if (mp.get(nums[idx]) == 0) {
                mp.remove(nums[idx]);
            }
        }

        int notTaken = dfs(nums, idx + 1, k, mp);

        return taken + notTaken;
    }

}
