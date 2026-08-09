class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        // Positive aur negative numbers alag karna hai
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                p.add(nums[i]);
            } else {
                n.add(nums[i]);
            }
        }

        // Ek positive, ek negative add karra hu
        for (int i = 0; i < p.size(); i++) {
            ans.add(p.get(i));
            ans.add(n.get(i));
        }

        // conversio
        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}