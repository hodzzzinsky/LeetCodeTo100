package and.hodz.algorithms.arrays_and_hashing.remove_element;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement2(new int[] {3, 2, 2, 3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j-1] == val) {
                    //swap
                    int tmp = nums[j - 1]; //
                    nums[j-1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 0;
                counter++;
            }
        }


        return nums.length - counter;
    }

    public static int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
