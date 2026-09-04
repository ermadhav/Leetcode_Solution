// There are two approaches to solve this 


// Approach --> 1
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int equalCount =0;

        // constructing the arraylist because remove and adding is easy
        ArrayList<Integer> list = new ArrayList<>();
        for(int n:nums){
            list.add(n);
        }

        // 
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){

                // If two elements are equal, we found a pair
                if(list.get(i).equals(list.get(j))){
                    equalCount++;
                    list.remove(j);
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }

        int[] ans = new int[2];
        ans[0] = equalCount;
        ans[1] = list.size();
        return ans;

    }
}

// Approach --> 2


