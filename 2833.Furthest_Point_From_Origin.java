class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int len = moves.length();
        int count = 0;
        int blank = 0;
        for(int i=0; i<len; i++){
            if(moves.charAt(i) == 'R'){
                count++;
            }else if(moves.charAt(i) == 'L'){
                count--;
            }else{
                blank++;
            }
        }
        return Math.abs(count)+blank;
    }
}