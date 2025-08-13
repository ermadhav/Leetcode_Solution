class Solution {
    public int countTriples(int n) {
        int count = 0; // Variable to store the total number of valid Pythagorean triples

        // Loop through all possible values of 'a' from 1 to n
        for (int a = 1; a <= n; a++) {
            // Loop through all possible values of 'b' from 1 to n
            for (int b = 1; b <= n; b++) {
                // Loop through all possible values of 'c' from 1 to n
                for (int c = 1; c <= n; c++) {
                    // Check if a^2 + b^2 = c^2 (Pythagorean triple condition)
                    if (a * a + b * b == c * c) {
                        count++; // Found a valid triple, increase the count
                    }
                }
            }
        }

        // Return the total number of valid triples
        return count;
    }
}
