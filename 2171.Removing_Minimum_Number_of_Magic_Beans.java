class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long total =0;
        long ans = Long.MAX_VALUE;
        for(int i=0; i<beans.length; i++){
            total += beans[i];
        }
        long prefix=0;
        for(int i=0; i<beans.length; i++){
            // Remove smaller bags + extra beans from remaining bags
            long remove = prefix+(total - (long) beans[i]*(beans.length-i));
            // Add current bag to removed prefix
            ans = Math.min(ans, remove);
        }
        return ans; 
    }
}