class Solution {
    public int findClosest(int x, int y, int z) {
        // Calculate distance between Person 1 and Person 3
        int min1 = Math.abs(z - x);
        
        // Calculate distance between Person 2 and Person 3
        int min2 = Math.abs(z - y);

        // If both distances are same, both reach at same time
        if(min1 == min2) return 0;

        // If Person 1 is closer, return 1
        if(min1 < min2) return 1;

        // Else, Person 2 is closer, return 2
        return 2;
    }
}
