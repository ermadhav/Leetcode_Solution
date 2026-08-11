class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] freq = new int[nums.length + 1];

        for (int num : nums) {
            freq[num]++;
            if(ans.size() < freq[num]){
                ans.add(new ArrayList<>());
            }
            ans.get(freq[num] - 1).add(num);
        }
        return ans;
    }
}