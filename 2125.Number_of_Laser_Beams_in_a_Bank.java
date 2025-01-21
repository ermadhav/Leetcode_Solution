class Solution {
    public int numberOfBeams(String[] bank) {
        // Variable to store the total number of beams
        int totalBeams = 0;
        // Previous row's device count
        int prevCount = 0;
        // Iterate through each row in the bank
        for (String row : bank) {
            // Count the number of devices (i.e., '1's) in the current row
            int currentCount = 0;
            for (char c : row.toCharArray()) {
                if (c == '1') {
                    currentCount++;
                }
            }
            // If the current row has devices
            if (currentCount > 0) {
                // Add the product of devices in the previous and current rows to the total
                totalBeams += prevCount * currentCount;
                // Update prevCount for the next iteration
                prevCount = currentCount;
            }
        }

        return totalBeams;
    }
}
