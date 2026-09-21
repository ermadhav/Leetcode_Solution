class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        // adding in set to remove duplicates
        Set<Integer> set1 =new HashSet<>();
        Set<Integer> set2 =new HashSet<>();

        for(int n: nums1)set1.add(n);
        for(int n: nums2)set2.add(n);

        List<Integer> x =new ArrayList<>();
        List<Integer> y =new ArrayList<>();

        // elemtn in num1 but not in num2
        for(int n:set1){
            if(!set2.contains(n)){
                x.add(n);
            }
        }
        
        // elemtn in num1 but not in num2
        for(int n:set2){
            if(!set1.contains(n)){
                y.add(n);
            }
        }
        return Arrays.asList(x,y);
    }
}