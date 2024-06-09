package and.hodz.algorithms.unfinished.palindrome_number;

public class PalindromeNumber {

    public static void main(String[] args) {
        int negative = -34;
        System.out.println(isPalindromeChatGPT(3));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            sb.append(s.charAt(i - 1));
        }
        return Integer.valueOf(sb.toString()).compareTo(x) == 0;
    }

    //ChatGPT solution
    public static boolean isPalindromeChatGPT(int x) {
        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        while(x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        return original == reversed;
    }
}
