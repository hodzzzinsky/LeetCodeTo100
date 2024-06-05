package and.hodz.algorithms.longest_consecutive_sequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(nums));
    }


    public static int longestConsecutive(int[] nums) {
        Set<Integer> seq = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int counter = 0;

        int index = 0;
        for (int i = 0; i < seq.size();) {
            if (seq.contains(nums[i] + 1))) {

            }
        }



        return counter;
    }
}
