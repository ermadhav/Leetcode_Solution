class Solution {
    public int generateKey(int num1, int num2, int num3) {
        // Convert each number into a 4-digit string
        // Example: 523 -> "0523", 678 -> "0678"
        String s1 = String.format("%04d", a),
               s2 = String.format("%04d", b),
               s3 = String.format("%04d", c);

        // To build the resulting key digit by digit
        StringBuilder key = new StringBuilder();

        // Loop through each digit position (0 to 3)
        for (int i = 0; i < 4; i++) {
            // Find the smallest digit at the current position
            // among s1, s2, and s3
            char minDigit = (char) Math.min(
                                s1.charAt(i),
                                Math.min(s2.charAt(i), s3.charAt(i))
                            );

            // Append the smallest digit to the key
            key.append(minDigit);
        }

        // Convert the key string to an integer
        // Integer.parseInt automatically removes any leading zeros
        return Integer.parseInt(key.toString());
    }
}