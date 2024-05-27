package and.hodz.algorithms.majority_element;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{}));
    }

    public static int majorityElement(int[] nums) {


        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            var orDefault = map.getOrDefault(num, 0);
            map.put(num, ++orDefault);
        }

        int max = 0;
        for (Integer integer : map.keySet()) {
            max = Math.max(max, map.get(integer));
        }

        for (Integer integer : map.keySet()) {
            if (map.get(integer) == max) {
                return integer;
            }
        }

        return 0;
    }


    public static int majorityElementArr(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    public static int majorityElementSmarterHashMap(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        n = n / 2;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > n) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
