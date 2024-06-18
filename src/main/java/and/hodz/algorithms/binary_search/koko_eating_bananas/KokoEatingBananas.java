package and.hodz.algorithms.binary_search.koko_eating_bananas;

public class KokoEatingBananas {

    public static void main(String[] args) {
        int [] piles = {3,6,7,11};
        System.out.println(minEatingSpeed(piles, 8));

        String a= "abc";
        char[] b = {'a', 'b'};

        if (a.contains(String.valueOf(b[0]))) System.out.println(b[0]);
    }


    public static int minEatingSpeed(int[] piles, int h) {
         int left = 1;
         int right = 1000000000;

         while(left <= right) {
             int mid = left + (right - left) / 2; // explain

             if (canEatInTime(piles, mid, h)) right = mid - 1;
             else left = mid + 1;
         }
        return left;
    }

    private static boolean canEatInTime(int[] piles, int mid, int h) {

        int hours = 0;
        for(int pile: piles) {
            int div =  pile / mid;
            hours +=div;
            if (pile % mid !=0) hours++;
        }
        return hours <= h;
    }
}
