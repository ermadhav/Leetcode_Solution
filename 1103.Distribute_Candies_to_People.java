class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people]; // store result
        int give = 1, i = 0;             // candies to give & turn index
        
        while (candies > 0) {
            res[i % num_people] += Math.min(give, candies); // give candies
            candies -= give; // reduce remaining candies
            give++;          // next turn give more
            i++;             // move to next person
        }
        return res;
    }
}
