import java.util.*;

class Solution {
    public int splitNum(int num) {
        // Convert number to digits and sort
        char[] d = String.valueOf(num).toCharArray();
        Arrays.sort(d);

        // Build two numbers alternately
        StringBuilder a = new StringBuilder(), b = new StringBuilder();
        for (int i = 0; i < d.length; i++)
            if (i % 2 == 0) a.append(d[i]); else b.append(d[i]);

        // Return sum of both numbers
        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
    }
}
