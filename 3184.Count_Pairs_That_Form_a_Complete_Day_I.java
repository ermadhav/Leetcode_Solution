class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int count =0;
        // using two loops
        for(int i=0; i<hours.length; i++){
            for(int j=i+1; j<hours.length; j++){
                // if the sum of hours[i]+hours[j] is divisible by 24 it means one day passed
                if((hours[i]+hours[j]) % 24 == 0){
                    count++;
                }
            }
        }
        return count;
    }
}