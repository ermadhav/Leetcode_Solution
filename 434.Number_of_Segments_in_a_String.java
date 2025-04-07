class Solution {
    public int countSegments(String s) {
        // Trim leading/trailing spaces and split by one or more whitespace characters
        String[] segments = s.trim().split("\\s+");
        
        // If the string is empty after trimming, return 0
        if (s.trim().isEmpty()) {
            return 0;
        }

        return segments.length;
    }
}
