package and.hodz.algorithms.container_with_most_water;

public class ContainerWIthMostWater {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,25,24,3,4};

        System.out.println(maxArea(numbers));
    }


    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int MostWater = 0;


        r= height.length - 1;
        while(l < r) {

            int min = Math.min(height[l], height[r]);
            int pool = r - l;
            int water = min * pool;
            MostWater = Math.max(MostWater, water);
            if (height[l] < height[r]) l++;
            else r--;
        }

        return MostWater;
    }

    public static  int maxArea2(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int res = 0;

        while (left < right) {
            int containerLength = right - left;
            int area = containerLength * Math.min(heights[left], heights[right]);
            res = Math.max(res, area);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}

