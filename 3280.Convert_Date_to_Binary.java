class Solution {
    public String dateToBinary(String date) {
        // Step 1: Split the date string into year, month, and day
        String[] parts = date.split("-");

        // Step 2: Convert each part to binary and concatenate with '-'
        return Integer.toBinaryString(Integer.parseInt(parts[0])) + "-" + // Convert year to binary
               Integer.toBinaryString(Integer.parseInt(parts[1])) + "-" + // Convert month to binary
               Integer.toBinaryString(Integer.parseInt(parts[2]));       // Convert day to binary
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example usage
        System.out.println(sol.dateToBinary("2024-02-14")); // Output: "11111100100-10-1110"
        System.out.println(sol.dateToBinary("2000-12-31")); // Output: "11111010000-1100-11111"
    }
}
