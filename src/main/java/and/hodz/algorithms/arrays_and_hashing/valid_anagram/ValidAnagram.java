package and.hodz.algorithms.arrays_and_hashing.valid_anagram;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidAnagram {

    public static void main(String[] args) {
        String  s = "haaaal", // a (3)
                t = "haaalz";
        System.out.println(isAnagram2(s, t));
    }

    public static boolean isAnagramFail1(String s, String t) {

        //Priority queue does not provides order

        if (s.length() != t.length()) return false;

        PriorityQueue<Character> queue = new PriorityQueue<>();
        for (char c : s.toCharArray()) {
            queue.add(c);
        }

        PriorityQueue<Character> queue1 = new PriorityQueue<>();
        for (char c : t.toCharArray()) {
            queue1.add(c);
        }



        for (int i = 0; i < queue.size(); i++) {
            if (!queue.poll().equals(queue1.poll())) return false;
        }


        return true;
    }

    public static boolean isAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        // if there are no key then 100% false
        // if there are map.get(ch) == 0 then there are no such symbol

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!map.containsKey(ch) || map.get(ch) == 0) return false;

            map.put(ch, map.get(ch) - 1);
        }


        return true;


    }

    public static boolean isAnagram2(String s, String t) {

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(tt);




        return Arrays.toString(ss).equals(Arrays.toString(tt));
    }
}
