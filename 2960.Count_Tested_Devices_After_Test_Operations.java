class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count =0;
        for(int i=0; i<batteryPercentages.length; i++){
            if(batteryPercentages[i] > 0){
                count++;
                for(int j=i; j<batteryPercentages.length; j++){
                    batteryPercentages[j] = batteryPercentages[j]-1;
                }
            }
        }
        return count;
    }
}