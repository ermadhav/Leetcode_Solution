class Solution {
    public String dateToBinary(String date) {
        // Step 1: Split the date string into year, month, and day
        String[] parts = date.split("-");

        // Step 2: Convert each part to binary and concatenate with '-'
        return Integer.toBinaryString(Integer.parseInt(parts[0])) + "-" + // Convert year to binary
               Integer.toBinaryString(Integer.parseInt(parts[1])) + "-" + // Convert month to binary
               Integer.toBinaryString(Integer.parseInt(parts[2]));       // Convert day to binary
    }
}
