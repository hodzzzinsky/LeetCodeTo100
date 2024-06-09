package and.hodz.algorithms.arrays_and_hashing.longest_consecutive_sequence;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(withRec(nums));
    }


    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (int n : numSet) {
            if (!numSet.contains(n - 1)) {
                int length = 1;
                while (numSet.contains(n + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }


    public static int withRec(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;
        for (int n : numSet) {
            if (!numSet.contains(n - 1)) {
                int length = findSequenceLength(numSet, n, 1);
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }

    private static int findSequenceLength(Set<Integer> numSet, int num, int length) {
        if (numSet.contains(num + 1)) {
            return findSequenceLength(numSet, num + 1, length + 1);
        }
        return length;
    }


}
