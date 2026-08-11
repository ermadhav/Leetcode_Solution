class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // freq store karega
        int[] freq = new int[nums.length + 1];

        for (int num : nums) {

            // curr num ki freq incrs 
            freq[num]++;

            // create a new row if needed 
            // ye bateyaga ki freq[num] konsi row me jayega 
            if(ans.size() < freq[num]){
                ans.add(new ArrayList<>());
            }
            
            ans.get(freq[num] - 1).add(num);
        }
        return ans;
    }
}