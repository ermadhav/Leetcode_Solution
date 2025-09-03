import java.util.*;

class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);     // earliest processors first
        Collections.sort(tasks);             // ascending
        int ans = 0, j = tasks.size() - 1;   // j points to largest task
        for (int i = 0; i < processorTime.size(); i++) {
            ans = Math.max(ans, processorTime.get(i) + tasks.get(j));
            j -= 4; // skip the 4 tasks given to this processor
        }
        return ans;
    }
}
