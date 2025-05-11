class Solution {
    public String maskPII(String s) {
        // Check if the input is an email (contains '@')
        if (s.contains("@")) {
            s = s.toLowerCase();
            String[] parts = s.split("@");
            String name = parts[0];
            String domain = parts[1];
            // Masking: keep first and last character, replace middle with 5 asterisks
            return name.charAt(0) + "*****" + name.charAt(name.length() - 1) + "@" + domain;
        } else {
            // It's a phone number
            String digits = s.replaceAll("[^0-9]", ""); // Remove all non-digit characters
            String local = digits.substring(digits.length() - 4); // Last 4 digits
            StringBuilder sb = new StringBuilder();

            int countryLength = digits.length() - 10;

            if (countryLength > 0) {
                sb.append("+");
                for (int i = 0; i < countryLength; i++) {
                    sb.append("*");
                }
                sb.append("-");
            }

            sb.append("***-***-").append(local);
            return sb.toString();
        }
    }
}
