class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
         // Array ko 3 parts mein divide karo
        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot){
                a1.add(nums[i]);
            }else if(nums[i] == pivot){
                a2.add(nums[i]);
            }else{
                a3.add(nums[i]);
            }
        }
        ans.addAll(a1);
        ans.addAll(a2);
        ans.addAll(a3);

        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}