import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;  // Start of current group

        for (int i = 0; i < s.length(); i++) {
            // Check if it's the end of the group (last char or char changes)
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                int groupLength = i - start + 1;
                if (groupLength >= 3) {
                    result.add(Arrays.asList(start, i));
                }
                start = i + 1;  // Start of next group
            }
        }

        return result;
    }
}