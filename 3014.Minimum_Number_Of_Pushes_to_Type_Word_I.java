class Solution {
    public int minimumPushes(String word) {
        int n = word.length();   // total distinct letters in word
        int pushes = 0;

        // Distribute letters across 8 keys to minimize pushes
        // Every 8 letters increase the push count by 1
        for(int i = 0; i < n; i++){
            pushes += (i / 8) + 1;   // calculate push cost for each letter
        }

        return pushes;   // minimum total pushes needed
    }
}