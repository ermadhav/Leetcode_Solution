public class StarCounter {
    public static int countAsterisks(String s) {
        boolean inside = false; // tracks if we're inside a pair of '|'
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '|') {
                inside = !inside; // flip the inside flag
            } else if (c == '*' && !inside) {
                count++; // only count '*' when outside '|...|'
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "a|b*c|d*e*|f|g*";
        System.out.println(countAsterisks(s)); // Output: 1
    }
}
