import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, max = 0;
        Map<Integer, Integer> basket = new HashMap<>(); // store fruit type -> count

        for (int right = 0; right < fruits.length; right++) {
            // add the current fruit to the basket
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            // if more than 2 fruit types, shrink window from the left
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) basket.remove(fruits[left]);
                left++; // move left pointer
            }

            // update max window size
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
