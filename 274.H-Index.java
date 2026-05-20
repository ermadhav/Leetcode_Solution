class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int count = 0;
        int n = citations.length;

        for(int i = 0; i < n; i++){
            if(citations[i] >= n - i){
                count = n - i;
                break;
            }
        }
        return count;
    }
}