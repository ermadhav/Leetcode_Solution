class Solution {
    public int maxDistinct(String s) {
        boolean[] seen = new boolean[26];

        // no. of distinct char
        int count = 0;

        //
        for(char c: s.toCharArray()){

            // if not seen before
            if(!seen[c-'a']){

                // mark seen
                seen[c-'a'] = true;

                // incrs distinct char
                count++;
            }
        }
        return count;
    }
}