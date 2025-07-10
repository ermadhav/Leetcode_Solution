class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;  // Represents the current depth in the folder structure

        // Iterate through each log entry
        for (String log : logs) {
            if (log.equals("../")) {
                // "../" means go up one level, but don't go above root
                if (depth > 0) {
                    depth--;
                }
            } else if (!log.equals("./")) {
                // Any other log (like "x/") means go into a new folder, so increase depth
                depth++;
            }
            // "./" means stay in the current directory; do nothing
        }

        // Return the final depth after processing all log operations
        return depth;
    }
}
