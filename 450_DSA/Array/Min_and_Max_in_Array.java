class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
