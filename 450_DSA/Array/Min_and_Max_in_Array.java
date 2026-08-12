class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // this two will be used to compare the min and max
        int min = arr[0]; 
        int max = arr[0];
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i]; // new min found update it
            if(arr[i] > max) max = arr[i]; // new max found update it
        }

        ans.add(min);
        ans.add(max);
        return ans;
    }
}
