package and.hodz.algorithms.median_of_two_sorted_arrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {3, 2};
        int[] nums2 = {1, 4};

        System.out.println(findMedianSortedArraysHard(nums1, nums2));
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);

        for (int i = 0; i < result.length; i++) {
            for (int j = 1; j < result.length; j++) {
                if (result[j] < result[j - 1]) {
                    int tmp = result[j];
                    result[j] = result[j - 1];
                    result[j - 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(result));


        if (result.length % 2 != 0) return result[result.length / 2];
        else {
            int sum = (result[result.length / 2 - 1] + result[result.length / 2]);
            return sum / 2f;
        }
    }


    public static double findMedianSortedArraysHard(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int left = 0;
        int right = m;
        while (left <= right) {
            int partitionA = (left + right) / 2;
            int partitionB = (m + n + 1) / 2 - partitionA;
            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : nums1[partitionA - 1];
            int minRightA = partitionA == m ? Integer.MAX_VALUE : nums1[partitionA];
            int minRightB = partitionB == n ? Integer.MAX_VALUE : nums2[partitionB];
            int maxLeftB = partitionB == 0 ? Integer.MIN_VALUE : nums2[partitionB - 1];
            if (maxLeftA <= minRightB && minRightA >= maxLeftB) {
                if ((m + n) % 2 == 0) {
                    return (double) ((double) Math.max(maxLeftA, maxLeftB) + (double) Math.min(minRightA, minRightB)) / 2;
                } else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                right = partitionA - 1;
            } else {
                left = partitionA + 1;
            }
        }
        return 0.0;
    }
}
