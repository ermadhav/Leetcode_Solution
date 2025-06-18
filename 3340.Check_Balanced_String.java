class Solution {
    public boolean isBalanced(String num) {
        int even = 0; // Sum of digits at even positions
        int odd = 0;  // Sum of digits at odd positions

        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i)); // Get digit

            if (i % 2 == 0) {
                even += digit; // Add to even sum
            } else {
                odd += digit;  // Add to odd sum
            }
        }

        return even == odd; // Check if both sums are equal
    }
}
