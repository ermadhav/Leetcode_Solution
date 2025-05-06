import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Step 1: Find the true max first
        int max = candies[0];
        for(int i = 1; i < candies.length; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
        }

        // Step 2: Build result list
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max){
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
