class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long total =0;
        long ans = Long.MAX_VALUE;
        // Calculate total beans
        for(int i=0; i<beans.length; i++){
            total += beans[i];
        }
        // remove all beans from bags before i, and reduce remaining bags to beans[i]
        long prefix=0;
        for(int i=0; i<beans.length; i++){
            long remove = prefix+(total - (long) beans[i]*(beans.length-i));
            ans = Math.min(ans, remove);
        }
        return ans; 
    }
}