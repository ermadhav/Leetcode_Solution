class Solution {
    public String removeTrailingZeros(String num) {
        int i = num.length()-1;

        // finding from last if found just decrease the index till non zero
        while(num.charAt(i) == '0'){
            i--;
        }
        // then return the substring
        return num.substring(0, i+1);
    }
}