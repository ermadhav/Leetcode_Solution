class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxDuration = releaseTimes[0];
        char resultKey = keysPressed.charAt(0);

        for(int i=1; i<keysPressed.length(); i++){
            int duration = releaseTimes[i]-releaseTimes[i-1];

            if(duration > maxDuration || (duration == maxDuration && keysPressed.charAt(i) > resultKey)){
                maxDuration = duration;
                resultKey = keysPressed.charAt(i);
            }
        }
        return resultKey;
    }
}