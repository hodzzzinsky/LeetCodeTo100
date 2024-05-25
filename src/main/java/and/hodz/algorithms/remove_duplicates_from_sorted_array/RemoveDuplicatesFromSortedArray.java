package and.hodz.algorithms.remove_duplicates_from_sorted_array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates2(new int[] {1, 1, 2, 2, 3, 3}));
    }

    public static int removeDuplicates(int[] nums) {

        Set<Integer> set = new HashSet<>();

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                nums[index] = nums[i];
                set.add(nums[i]);
                index++;
            }
        }
        return index;
    }

    public static int removeDuplicates2(int[] nums) {

        int i =0;
        for(int j =0; j< nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
