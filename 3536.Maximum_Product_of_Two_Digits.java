class Solution {
    public int maxProduct(int n) {
        // Convert the number to a string to access each digit easily
        String numStr = Integer.toString(n);
        int len = numStr.length();
        int maxProduct = 0;

        // Loop through all unique pairs of digits (i, j) where i < j
        for (int i = 0; i < len; i++) {
            int digit1 = numStr.charAt(i) - '0'; // Convert char to int
            for (int j = i + 1; j < len; j++) {
                int digit2 = numStr.charAt(j) - '0'; // Convert char to int

                // Calculate the product of the two digits
                int product = digit1 * digit2;

                // Update maxProduct if the current product is greater
                maxProduct = Math.max(maxProduct, product);
            }
        }

        // Return the highest product found
        return maxProduct;
    }
}