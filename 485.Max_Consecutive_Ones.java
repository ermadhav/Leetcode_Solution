class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxStreak = 0;
        int currentStreak = 0;

        for(int num: nums){
            if(num == 1){
                currentStreak++;
                maxStreak = Math.max(maxStreak, currentStreak);
            }else{
                currentStreak = 0;
            }
        }
        return maxStreak;
    }
}