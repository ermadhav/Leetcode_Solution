class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int left = 0;
        int right = 0;
        int i = startIndex;
        int count = 0;
        boolean found = false;

        // Traverse to the right
        while (count < words.length) {
            if (words[i].equals(target)) {
                found = true;
                break;
            }
            i++;
            if (i == words.length) i = 0;
            count++;
            right++;
        }

        if (!found) return -1; // If not found in the right traversal, return -1

        i = startIndex;
        count = 0;
        left = 0;
        found = false;

        // Traverse to the left
        while (count < words.length) {
            if (words[i].equals(target)) {
                found = true;
                break;
            }
            i--;
            if (i < 0) i = words.length - 1;
            count++;
            left++;
        }

        return Math.min(left, right);
    }
}
