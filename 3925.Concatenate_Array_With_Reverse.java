class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;

        int[] newArray = new int[2*n]; // New Array of 2X Size 
        for(int i=0; i<n; i++){
            newArray[i] = nums[i]; // first N numbers are same

            newArray[i+n] = nums[n-i-1]; // adding elements in reverse order basically putting the last number of array on the i+n index
        }
        return newArray;
    }
}