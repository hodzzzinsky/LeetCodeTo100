package and.hodz.algorithms.sum_of_all_subset_XOR_totals;

public class SumOfAllSubsetXORTotals {

    public static void main(String[] args) {
        System.out.println(subsetXORSum(new int[]{1,3}));
    }

    public static int subsetXORSum(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            for (int j = i; j < nums.length; j++) {
                int xor = nums[i] ^ nums[j];
                count += xor;
            }
        }

        int additional = 0;
        for (int i = 1; i < nums.length; i++) {
            additional += nums[i];
        }
        additional = additional ^ nums[0];
        count += additional;
        return count;
    }

}
