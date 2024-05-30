package and.hodz.algorithms.top_k_freq_element;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};

        int k = 2 ;

        System.out.println(Arrays.toString(topKFrequent2(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // 100 000 -> O(n)

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            //O(n)
        }



        List<String> list = new ArrayList<>(); // 100 000 -> O(n)
        for (Map.Entry<Integer, Integer> es : map.entrySet()) {
            list.add(es.getKey() + "=" + es.getValue());
            //O(n)
        }

        //Collections.sort(list, (o1, o2) -> o1.getTime() - o2.getTime());

        Collections.sort(list, Comparator.comparingInt(key -> Integer.parseInt(key.split("=")[1])));
        // O(log n)


        int[] result = new int[k];

        int index = 0; //4 bytes

        System.out.println(Arrays.toString(list.toArray()));


        for (int i = list.size()- 1; i >= list.size() - k; i--) {
            result[index++] = Integer.parseInt(list.get(i).split("=")[0]);
        }
        //O(n)

        // 100 000 -> O(n)

        // k log k + N

        //final t c = o(3n) -> 0(n * log n)
        //final s u o(3n + 1) -> O(n)

        return result;
    }


    public static int[] topKFrequent2(int[] nums, int k) {
        return  new int[0];
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }



        return result;
    }

}
