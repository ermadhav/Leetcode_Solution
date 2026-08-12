class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){

            ans[i] = arr[n-i-1]; // arr[n-i-1] is used to get the elements from last
        }
        for(int i=0; i<n;i++){
            arr[i] = ans[i];
        }
    }
}