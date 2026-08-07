class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        // Friends ko HashSet me store karna hai 
        HashSet<Integer> set = new HashSet<>();
        for (int friend : friends) {
            set.add(friend);
        }

        // Used to Store Ans
        int[] ans = new int[friends.length];
        int index = 0;

        // Race ka order 
        for (int racer : order) {

            // Agar racer friend hai
            if (set.contains(racer)) {

                
                ans[index] = racer;
                index++;
            }
        }

        return ans;
    }
}