package and.hodz.algorithms.arrays_and_hashing.find_the_index_of_the_first_occurrence_in_a_string;

public class FindFirstIndexInOccurrenceOfAString {
    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";

        String s = " abc abc abc ";
        String str = s.trim();
        int i = str.length() -1, len = 0;
        while(i >= 0 && str.charAt(i) != ' ') {
            i--;
            len++;
        }
        System.out.println(len);


        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        return -1;
    }
}
