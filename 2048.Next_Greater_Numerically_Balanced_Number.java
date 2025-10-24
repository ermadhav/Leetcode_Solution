class Solution {
    public int nextBeautifulNumber(int n) {
        while (true) {
            n++;
            if (isBalanced(n)) return n;
        }
    }
    private static boolean isBalanced(int num) {
        String s = String.valueOf(num);
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) count.put(c, count.getOrDefault(c, 0) + 1);
        for (char c : s.toCharArray()) if (count.get(c) != c - '0') return false;
        return true;
    }
}