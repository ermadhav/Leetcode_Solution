class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        int depth = 0;

        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                res[i] = depth % 2; // Alternate groups based on current depth
                depth++;
            } else {
                depth--;
                res[i] = depth % 2; // Match closing with correct group
            }
        }
        return res;
    }
}