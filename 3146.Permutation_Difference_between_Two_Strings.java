class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans =0;

        // Traverse each char of s
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            // Traverse each char of t
            for(int j=0; j<t.length(); j++){
                if(t.charAt(j) == ch){

                    // indices ka absolute difference ko add kar
                    ans += Math.abs(i-j);
                    break;
                }
            }
        }
        return ans;
    }
}