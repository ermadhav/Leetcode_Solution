class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;

        int temp = arr[n-1]; // storing the last no.

        // shifting the number by one from left -> right
        for(int i=1; i<n; i++){
            arr[n-i] = arr[n-i-1];
        }
        
        arr[0] = temp;
    }
}