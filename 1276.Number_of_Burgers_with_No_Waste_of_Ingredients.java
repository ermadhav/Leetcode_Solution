class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        // no. of cheeseburgers
        int jumbo =(tomatoSlices-2*cheeseSlices)/2;
        int small =cheeseSlices-jumbo;
        if(tomatoSlices<2*cheeseSlices || tomatoSlices%2 !=0 ||jumbo<0 || small<0){
            return new ArrayList<>();
        }
        return Arrays.asList(jumbo, small);
    }
}