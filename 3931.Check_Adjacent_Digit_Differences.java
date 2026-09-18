class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int[] arr = new int[s.length()];
        // converting no. string to int arr
        for(int i=0; i<s.length(); i++){
            arr[i] = s.charAt(i)-'0';
        }

        // calcutlating abs diff 
        for(int i=0; i<s.length()-1; i++){
            // if > 2 return false
            if(Math.abs(arr[i]-arr[i+1])>2){
                return false;
            }
        }
        // otherwise true
        return true;
    }
}