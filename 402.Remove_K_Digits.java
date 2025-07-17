
class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();

        // Iterate through each digit
        for (char c : num.toCharArray()) {
            // Remove larger digits from the end to make number smaller
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c); // Add current digit
        }

        // If k digits are still left, remove from the end
        sb.setLength(sb.length() - k);

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        // Return result or "0" if empty
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
