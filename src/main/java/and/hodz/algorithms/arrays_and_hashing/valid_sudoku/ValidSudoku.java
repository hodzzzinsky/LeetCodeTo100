package and.hodz.algorithms.arrays_and_hashing.valid_sudoku;

import java.util.*;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board =
        {
                {'5','3','2','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> boxes = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;
                else {
                    char val = board[r][c];
                    if (rows.getOrDefault(r, new HashSet<>()).contains(val)
                        || cols.getOrDefault(c, new HashSet<>()).contains(val)
                        || boxes.getOrDefault((r / 3) * 3 + c / 3 , new HashSet<>()).contains(val)
                    ) {
                        return false;
                    } else {
                        rows.computeIfAbsent(r, k -> new HashSet<>()).add(val);
                        cols.computeIfAbsent(c, k -> new HashSet<>()).add(val);
                        boxes.computeIfAbsent((r / 3) * 3 + c / 3, k -> new HashSet<>()).add(val);

                    }
                }

            }
        }

        return true;
    }



    public static boolean isValidSudokuBeautiful(char[][] board) {
        boolean[][] rowUsed = new boolean[9][10];
        boolean[][] colUsed = new boolean[9][10];
        boolean[][] boxUsed = new boolean[9][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                int val = board[i][j] - '0'; // an interesting way to convert char-number to int type
                if (rowUsed[i][val] || colUsed[j][val] || boxUsed[i / 3 * 3 + j / 3][val]) {
                    return false;
                }

                rowUsed[i][val] = true;
                colUsed[j][val] = true;
                boxUsed[i / 3 * 3 + j / 3][val] = true;
            }
        }
        return true;
    }
}
