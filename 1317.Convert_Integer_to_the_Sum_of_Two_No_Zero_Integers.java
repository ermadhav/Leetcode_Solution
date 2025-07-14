public int[] getNoZeroIntegers(int n) {
    // Loop through possible values of 'a' from 1 to n-1
    for (int a = 1; a < n; a++) {
        int b = n - a; // Calculate b so that a + b = n

        // Check if both a and b do not contain the digit '0'
        if (!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")) {
            // Return the valid pair [a, b]
            return new int[]{a, b};
        }
    }

    // This return is never reached because a valid solution always exists
    return null;
}
