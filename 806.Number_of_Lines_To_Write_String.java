class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0, row =1; // Start with 1 row, as there will always be at least one line
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            sum += widths[ch -'a'];
            if(sum>100){
            row++;
            sum = widths[ch-'a'];
            }
        }
        return new int[] {row, sum};
    }
}