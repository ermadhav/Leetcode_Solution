class Solution {
    public int minimumSwap(String s1, String s2) {
        // s1 has x, s2 has y
        // s1 has y, s2 has x
        int xy = 0;
        int yx = 0;
        // count mismatched pair
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'x' && s2.charAt(i) == 'y') {
                xy++;
            } else if (s1.charAt(i) == 'y' && s2.charAt(i) == 'x') {
                yx++;
            }
        }
        // odd total mismatches cannot be fixed
        if ((xy + yx) % 2 != 0) {
            return -1;
        }
        // pair same mismatches; leftover pair needs 2 swaps
        return (xy / 2) + (yx / 2) + (xy % 2) * 2;
    }
}