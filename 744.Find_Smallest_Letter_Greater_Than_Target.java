class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;

        // Binary search to find the smallest letter greater than the target
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If mid letter is less than or equal to target, search in the right half
            if (letters[mid] <= target) {
                low = mid + 1;
            } else {
                // If mid letter is greater than target, search in the left half
                high = mid - 1;
            }
        }

        // If low goes past the end of array, wrap around and return the first letter
        return letters[low % letters.length];
    }
}