class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];  // Create an array of size n
        int ans = 0;             // Initialize result to 0
        
        for(int i = 0; i < n; i++){
            arr[i] = start + 2 * i;  // Fill array with elements: start + 2*i
            ans = ans ^ arr[i];     // XOR each element with result
        }
        
        return ans;  // Return the final XOR result
    }
}
