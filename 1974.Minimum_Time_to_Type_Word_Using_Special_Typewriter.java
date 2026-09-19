class Solution {
    public int minTimeToType(String word) {
        int l = word.length();
        int ans = 0;

        // typewritter starts from 'a'
        int curr = 0;
        for(int i=0; i<l; i++){
            // converting target char into num
            int target = word.charAt(i) - 'a';
            // distance in cw direction from curr to target
            int cw = Math.abs(curr-target);
            int acw = 26-cw;
            int movement = Math.min(cw, acw);
            ans += movement+1;
            curr = target;
        }
        return ans;
    }
}