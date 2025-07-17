public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        
        // Binary search to find the first bad version
        while (low < high) {
            // Prevent potential overflow
            int mid = low + (high - low) / 2;
            
            // Check if mid version is bad
            if (isBadVersion(mid)) {
                // If mid is bad, the first bad version is at mid or before
                high = mid;
            } else {
                // If mid is good, the first bad version is after mid
                low = mid + 1;
            }
        }
        
        // When low meets high, it is the first bad version
        return low;
    }
}
