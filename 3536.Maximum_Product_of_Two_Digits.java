class Solution {
    public int maxProduct(int n) {
        String numStr = Integer.toString(n);
        int len = numStr.length();
        int maxProduct = 0;

        for (int i = 0; i < len; i++) {
            int digit1 = numStr.charAt(i) - '0';
            for (int j = i + 1; j < len; j++) {
                int digit2 = numStr.charAt(j) - '0';
                int product = digit1 * digit2;
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }
}