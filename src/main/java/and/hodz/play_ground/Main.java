package and.hodz.play_ground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static String G = "";


    public static void main(String[] args) {

        String string = "4#neet4#code4#love3#you";
        //System.out.println(decode(string));



        int[] nums = {1,2,3,4};

        int[] list = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for(int j = 0 ; j < nums.length; j++) {
                if(j==i) continue;
                else sum = sum * nums[j];
            }
            list[counter++] = sum;
        }

        System.out.println(Arrays.toString(list));
    }

    public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;

            while(str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));

            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }


        return list;
    }

}
