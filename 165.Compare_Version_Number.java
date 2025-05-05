class Solution {
    public int compareVersion(String version1, String version2) {
        // Correctly declare arrays to store split version parts
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");

        // Find the maximum length of the two arrays
        int n = Math.max(a.length, b.length);

        // Iterate through each part of the version strings
        for (int i = 0; i < n; i++) {
            // Convert the string parts to integers, default to 0 if out of bounds
            int num1 = i < a.length ? Integer.parseInt(a[i]) : 0;
            int num2 = i < b.length ? Integer.parseInt(b[i]) : 0;

            // Compare the version numbers at the current part
            if (num1 != num2) {
                return num1 > num2 ? 1 : -1;
            }
        }

        // All parts are equal
        return 0;
    }
}
