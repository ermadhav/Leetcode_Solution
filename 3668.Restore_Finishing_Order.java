class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        // Friends ko HashSet me store karna hai 
        HashSet<Integer> set = new HashSet<>();
        for (int friend : friends) {
            set.add(friend);
        }

        // Answer store karne ke liye array
        int[] ans = new int[friends.length];
        int index = 0;

        // Race ke order ko ek-ek karke dekho
        for (int racer : order) {

            // Agar racer friend hai
            if (set.contains(racer)) {

                // Answer me add kar do
                ans[index] = racer;
                index++;
            }
        }

        // Final answer return karo
        return ans;
    }
}