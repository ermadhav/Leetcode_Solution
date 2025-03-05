import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        // Convert input strings to BigInteger (handles large numbers safely)
        BigInteger num11 = new BigInteger(num1);
        BigInteger num22 = new BigInteger(num2);

        // Add the two BigInteger numbers
        BigInteger sum1 = num11.add(num22);

        // Convert the sum back to a string and return
        return sum1.toString();
    }
}
