class Solution {
    public String licenseKeyFormatting(String s, int k) {
        // 1. Remove dashes and convert to uppercase
        String cleaned = s.replace("-", "").toUpperCase();

        StringBuilder result = new StringBuilder();
        int count = 0;

        // 2. Build from end to start, inserting dashes after every k chars
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            result.append(cleaned.charAt(i));
            count++;

            if (count == k && i != 0) {
                result.append('-');
                count = 0;
            }
        }

        // 3. Reverse to get correct order
        return result.reverse().toString();
    }
}
