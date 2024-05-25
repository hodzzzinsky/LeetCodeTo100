package and.hodz.algorithms.merge_sorted_array;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] num1 = new int[6];
        num1[0] = 1;
        num1[1] = 3;
        num1[2] = 2;

        int m = 3;


        int[] num2 = {2, 7, 6};
        int n = 3;
        merge2(num1, m, num2, n);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[index++];
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 1; j < nums1.length; j++) {

                if (nums1[j - 1] > nums1[j]) {

                    int tmp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = tmp;
                }
            }
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        // Make a copy of the first m elements of nums1.
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1Copy[i] = nums1[i];
        }

        // Read pointers for nums1Copy and nums2 respectively.
        int p1 = 0;
        int p2 = 0;

        // Compare elements from nums1Copy and nums2 and write the smallest to nums1.
        for (int p = 0; p < m + n; p++) {
            // We also need to ensure that p1 and p2 aren't over the boundaries
            // of their respective arrays.
            if (p2 >= n || (p1 < m && nums1Copy[p1] < nums2[p2])) {
                nums1[p] = nums1Copy[p1++];
            } else {
                nums1[p] = nums2[p2++];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }


}
