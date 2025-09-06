class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // Sort both arrays
        Arrays.sort(target);
        Arrays.sort(arr);
        // Check if sorted arrays are equal
        return Arrays.equals(target, arr);
    }
}