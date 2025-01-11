class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxDuration = releaseTimes[0]; // Initialize maxDuration with the first key press duration
        char resultKey = keysPressed.charAt(0);// Initialize resultKey as the first key pressed

        // Loop through the rest of the keys pressed
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