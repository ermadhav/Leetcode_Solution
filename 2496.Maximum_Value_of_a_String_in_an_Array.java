class Solution {
    public int maximumValue(String[] strs) {
        int maxValue=0;
        for(int i=0; i<strs.length; i++){
            int value;
            if(strs[i].matches("\\d+")){
                value = Integer.parseInt(strs[i]);
            }else {
                value = strs[i].length();
            }
            maxValue = Math.max(maxValue, value);
        }
        return maxValue;
    }
}