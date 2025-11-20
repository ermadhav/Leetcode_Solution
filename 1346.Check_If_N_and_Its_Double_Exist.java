class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean ans = false;
        
        // Check every pair to see if one is double the other
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                
                // Ensure indices are different and compare values
                if(i != j && arr[i] == 2 * arr[j]){
                    ans = true;
                }
            }
        }
        return ans; // Return true if such a pair exists
    }
}
