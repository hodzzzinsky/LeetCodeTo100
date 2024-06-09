package and.hodz.algorithms.unfinished.longest_substring_without_repeating_characters;

import java.util.Stack;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int counter = 0;
        int max = 0;
        Stack<Character> chars = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (chars.contains(current)) {
                counter = 0;
                chars.clear();
            }
            counter++;
            chars.push(current);
            max = Math.max(max, counter);
        }
        return max;
    }
}
