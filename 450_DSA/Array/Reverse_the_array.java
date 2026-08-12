class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[n - i - 1];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }
}