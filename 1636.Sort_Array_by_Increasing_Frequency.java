// Approach ---> 1

import java.util.*;

public class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // Convert array to Integer[] for custom sorting
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // Custom sorting rule
        Arrays.sort(arr, (a, b) -> {
            int freqA = freq.get(a);
            int freqB = freq.get(b);

            if (freqA != freqB) {
                return freqA - freqB;  // increasing order of frequency
            } else {
                return b - a;          // decreasing order of value
            }
        });

        // Convert back to int[]
        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,2,2,2,3};
        int[] result = sol.frequencySort(nums);

        System.out.println(Arrays.toString(result));
    }
}

// Approach ---> 2 

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());

        // sorting list according to freq 
        list.sort((a,b) -> {

            // Agar frequency different hai to jiski frequency kam hai wo pehle 
            if(!map.get(b).equals(map.get(a))){
                return map.get(a) - map.get(b);
            }else{
                return b-a;
            }
        });

        int[] ans = new int[nums.length];
        int k=0;
        for(int n : list){
            for(int i=0; i<map.get(n); i++){
                ans[k++] = n;
            }
        }
        return ans;
    }
}