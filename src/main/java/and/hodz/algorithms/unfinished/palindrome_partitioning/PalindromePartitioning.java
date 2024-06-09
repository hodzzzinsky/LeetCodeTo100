package and.hodz.algorithms.unfinished.palindrome_partitioning;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {
        List<List<String>> lists = partition("aab");
        System.out.println(lists.size());
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<String>(), result);
        return result;
    }


    private static void backtrack(String s, int start, List<String> path, List<List<String>> result) {
        if(start ==s.length()) {
            result.add(new ArrayList<String>(path));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            if (isPalindrome(s, start, end - 1)) {
                path.add(s.substring(start, end));
                backtrack(s, end, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

}
