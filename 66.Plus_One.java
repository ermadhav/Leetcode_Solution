class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();

        // Convert digits to a string and append to the StringBuilder
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }
        
        // Convert the string to a number and add 1
        int num = Integer.parseInt(sb.toString()) + 1;

        // Convert the number back to an array
        String numStr = String.valueOf(num);
        int[] result = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            result[i] = numStr.charAt(i) - '0';
        }
        return result;
    }
}
