class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        HashSet<Integer> set1 =new HashSet<>();
        HashSet<Integer> set2 =new HashSet<>();
        HashSet<Integer> set3 =new HashSet<>();

        for(int x:nums1)set1.add(x);
        for(int x:nums2)set2.add(x);
        for(int x:nums3)set3.add(x);

        HashMap<Integer,Integer> map =new HashMap<>();

        for(int x: set1){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(int x: set2){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(int x: set3){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int x: map.keySet()){
            if(map.get(x)>= 2){
                ans.add(x);
            }
        }
        return ans;
    }
}