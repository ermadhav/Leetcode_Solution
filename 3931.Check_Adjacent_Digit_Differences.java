class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int[] arr = new int[s.length()];
        boolean ans = true;
        for(int i=0; i<s.length(); i++){
            arr[i] = s.charAt(i)-'0';
        }
        for(int i=0; i<s.length()-1; i++){
            if(Math.abs(arr[i]-arr[i+1])>=2){
                ans = false;
            }else{
                ans = true;
            }
        }
        return ans;
    }
}