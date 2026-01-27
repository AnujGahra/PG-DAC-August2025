import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class TopKFrequentElements {

    class Pair implements Comparable<Pair> {
        int num, count;
        Pair(int num, int count) {
            this.num = num;
            this.count = count;
        }

        public int compareTo(Pair b) {
            return this.count - b.count; 
    }
    }
    

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        Set<Integer> keys = map.keySet();
        for(int key : keys) {
            if(pq.size() < k) {
                pq.add(new Pair(key, map.get(key)));
            } else if(map.get(key) > pq.peek().count) {
                pq.poll();
                pq.add(new Pair(key, map.get(key)));
            }
        }

        int[] arr = new int[k];
        int i = k-1;
        while(i>0) {
            arr[i--] = pq.poll().num;
            return arr;
        }
    }


    // main method for testing
    public static void main(String[] args) {
        TopKFrequentElements tkfe = new TopKFrequentElements();
        int[] input = {1,1,1,2,2,3};
        int k = 2;
        int[] result = tkfe.topKFrequent(input, k);
        for (int num : result) {
            System.out.print(num + " "); // Output: 1 2
        }
    }
}
