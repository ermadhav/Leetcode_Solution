class Solution {
    public int primePalindrome(int n) {
        // Keep checking numbers until we find a prime palindrome
        while (true) {
            if (isPal(n) && isPrime(n)) return n; // Found it
            n++; // Try next number

            // Skip numbers with 8-digit palindromes (not prime except 11)
            if (n > 10000000 && n < 100000000) n = 100000000;
        }
    }

    // Check if number is a palindrome
    boolean isPal(int x) {
        String s = x + "";
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // Check if number is prime
    boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++)
            if (x % i == 0) return false;
        return true;
    }
}
