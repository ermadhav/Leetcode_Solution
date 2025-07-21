class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder(); // To build the final fancy string

        for (int i = 0; i < s.length(); i++) {
            int len = res.length();

            // Check if the last two characters in res are same as current character
            if (len >= 2 && res.charAt(len - 1) == s.charAt(i) && res.charAt(len - 2) == s.charAt(i))
                continue; // Skip current character to avoid 3 in a row

            res.append(s.charAt(i)); // Add character to result
        }

        return res.toString(); // Return the final fancy string
    }
}