class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        // creating set to store unique values
        HashSet<Integer> set1 =new HashSet<>();
        HashSet<Integer> set2 =new HashSet<>();
        HashSet<Integer> set3 =new HashSet<>();

        // add elements of each array into sets
        for(int x:nums1)set1.add(x);
        for(int x:nums2)set2.add(x);
        for(int x:nums3)set3.add(x);
        //map will store: number-> no. of arrays it appear in
        HashMap<Integer,Integer> map =new HashMap<>();

        // add elements of each array into their respective sets
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