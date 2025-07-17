class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    // Pointers for the last elements of nums1 and nums2 (excluding extra 0s in nums1)
    int i = m - 1; // Index of last valid element in nums1
    int j = n - 1; // Index of last element in nums2
    int k = m + n - 1; // Index of last position in nums1 (including extra space)

    // Merge from the end to avoid overwriting values in nums1
    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--]; // Copy larger value from nums1
        } else {
            nums1[k--] = nums2[j--]; // Copy larger value from nums2
        }
    }

    // If any elements are left in nums2, copy them to nums1
    // (no need to check nums1, it's already in place)
    while (j >= 0) {
        nums1[k--] = nums2[j--];
    }
}

}