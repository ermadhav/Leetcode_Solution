class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count =0;
        
        // arr1 ke elements
        for(int i=0; i<arr1.length; i++){
            boolean valid = true;

            // comparing arr1 elements with arr2
            for(int j=0; j<arr2.length; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    valid = false;
                    break;
                }
                
            }
            if(valid){
                count++;
            }
        }
        return count;
    }
}