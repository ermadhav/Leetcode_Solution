import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Create a new array with combined size of nums1 and nums2
        int[] merged = new int[nums1.length + nums2.length];
        
        // Copy elements of nums1 into merged
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        
        // Copy elements of nums2 into merged (starting after nums1 elements)
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        // Sort the merged array so we can find the median
        Arrays.sort(merged);

        int length = merged.length;

        // If the total number of elements is odd, return the middle element
        if (length % 2 != 0) {
            return merged[length / 2];
        } 
        // If even, return the average of the two middle elements
        else {
            return (merged[length / 2 - 1] + merged[length / 2]) / 2.0;
        }
    }
}
