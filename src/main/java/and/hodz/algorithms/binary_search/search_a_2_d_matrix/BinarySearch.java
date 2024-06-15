package and.hodz.algorithms.binary_search.search_a_2_d_matrix;

public class BinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        System.out.println(searchMatrix(matrix, 5));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols - 1;

        while(row < rows && col > -1) {
            int cur = matrix[row][col];
            if(cur == target) return true;
            if(target > cur) row++;
            else col--;
        }

        return false;
    }
}
