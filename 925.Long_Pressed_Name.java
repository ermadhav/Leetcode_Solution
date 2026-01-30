class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0; // i for name, j for typed

        // Traverse through typed string
        while (j < typed.length()) {

            // If characters match, move both pointers
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            // If current typed character is same as previous, it's a long press
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }
            // Invalid case
            else {
                return false;
            }
        }

        // Check if all characters of name are matched
        return i == name.length();
    }
}
