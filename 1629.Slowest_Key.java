class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxDuration = releaseTimes[0]; // Initialize maxDuration with the first key press duration
        char resultKey = keysPressed.charAt(0);// Initialize resultKey as the first key pressed

        // Loop through the rest of the keys pressed
        for(int i=1; i<keysPressed.length(); i++){

            // Calculate the duration of the current key press
            int duration = releaseTimes[i]-releaseTimes[i-1];

            // If current key press duration is longer or the same but lexicographically larger, update result
            if(duration > maxDuration || (duration == maxDuration && keysPressed.charAt(i) > resultKey)){
                maxDuration = duration;// Update max duration
                resultKey = keysPressed.charAt(i);// Update the result key
            }
        }
        return resultKey;
    }
}