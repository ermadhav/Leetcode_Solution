class Solution {
    public String addBinary(String a, String b) {
        // Convert binary strings to BigInteger (base 2)
        java.math.BigInteger num1 = new java.math.BigInteger(a, 2);
        java.math.BigInteger num2 = new java.math.BigInteger(b, 2);

        // Add the two numbers
        java.math.BigInteger sum = num1.add(num2);
        
        // Convert the sum back to a binary string
        return sum.toString(2);
    }
}
