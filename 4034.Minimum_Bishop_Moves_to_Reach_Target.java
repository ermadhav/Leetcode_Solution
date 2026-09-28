class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int ans = 0;
        int sr = source[0];
        int sc = source[1];
        int tr = target[0];
        int tc = target[1];
        // if src and target is same return 0 because there is no need to move 
        if(sc == tc && sr == tr){
            return 0;
        }else if((sc+sr)%2 != (tr+tc)%2){
            return -1;
        }else if(Math.abs(sr-tr) == Math.abs(sc-tc)){
            return 1;
        }
        return 2;
    }
}