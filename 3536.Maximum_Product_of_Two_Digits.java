class Solution {
    public int maxProduct(int n) {
        // Convert the integer n to a string so we can access each digit
        String s = Integer.toString(n);

        // Variable to store the maximum product found
        int maxProd = 0;

        // Loop over all starting positions of substrings
        for (int i = 0; i < s.length(); i++) {
            int prod = 1;

            // Loop to extend the substring from position i to j
            for (int j = i; j < s.length(); j++) {
                // Convert the current character to a digit
                int digit = Character.getNumericValue(s.charAt(j));

                // Multiply the product by the current digit
                prod *= digit;

                // Update maxProd if the current product is greater
                maxProd = Math.max(maxProd, prod);
            }
        }

        // Return the maximum digit product found among all substrings
        return maxProd;
    }
}
