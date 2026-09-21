class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 =new HashSet<>();
        Set<Integer> set2 =new HashSet<>();

        for(int n: nums1)set1.add(n);
        for(int n: nums2)set2.add(n);

        List<Integer> x =new ArrayList<>();
        List<Integer> y =new ArrayList<>();

        for(int n:set1){
            if(!set2.contains(n)){
                x.add(n);
            }
        }
        for(int n:set2){
            if(!set1.contains(n)){
                y.add(n);
            }
        }
        return Arrays.asList(x,y);
    }
}