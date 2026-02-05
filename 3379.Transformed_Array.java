class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n]; // Result array

        for(int i = 0; i < n; i++){
            int a = nums[i]; // Value at current index

            // Calculate new index using circular movement
            int newIndex = (i + a) % n;

            // Handle negative index by wrapping around
            if(newIndex < 0){
                newIndex += n;
            }

            // Place the value from the new index into result array
            arr[i] = nums[newIndex];
        }

        return arr; // Return transformed array
    }
}
