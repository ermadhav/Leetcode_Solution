class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        // used to remove duplicate
        HashSet<Integer> set = new HashSet<>();
        // add array element into set
        for(int n:nums){
            set.add(n);
        }

        // add set to list
        ArrayList<Integer> list = new ArrayList<>(set);
        // sorting list
        Collections.sort(list);

        
        int size = Math.min(k, list.size());
        int[] ans = new int[size];
        for(int i=0; i<size; i++){
            ans[i] = list.get(list.size()-1-i);
        }
        return ans;
    }
}