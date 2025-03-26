class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false; // A mountain array must have at least 3 elements

        int i = 0;

        // Climbing up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak can't be first or last element
        if (i == 0 || i == n - 1) return false;

        // Climbing down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // If we reached the end, it's a valid mountain array
        return i == n - 1;
    }
}
