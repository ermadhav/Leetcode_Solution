import java.util.*;

class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] res = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        // Step 1: Store each interval's start as the key and its index as the value
        for (int i = 0; i < n; i++) 
            map.put(intervals[i][0], i);
        
        // Step 2: For each interval, find the "right interval"
        for (int i = 0; i < n; i++) {
            // ceilingEntry gives the smallest key >= intervals[i][1] (end of current interval)
            Map.Entry<Integer, Integer> entry = map.ceilingEntry(intervals[i][1]);
            
            // If found, store the index of that interval; otherwise store -1
            res[i] = (entry == null) ? -1 : entry.getValue();
        }
        
        // Step 3: Return result array
        return res;
    }
}
