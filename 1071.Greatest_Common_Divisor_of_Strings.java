class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();

        // Check if both strings are made by repeating the same base string
        if(!(str1 + str2).equals(str2 + str1)) {
            return ""; // If not, return empty string
        }

        // Find the common pattern with length equal to GCD of lengths
        String result = str1.substring(0, gcd(len1, len2));
        return result;
    }

    // Helper method to find GCD of two numbers
    private int gcd(int num1, int num2) {
        if(num2 == 0) {
            return num1; // Base case
        }
        return gcd(num2, num1 % num2); // Recursive call
    }
}
