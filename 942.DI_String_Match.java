class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();

        // smallest avil no.
        int low = 0;
        // largest avail no.
        int high = n;
        // store the perm
        ArrayList<Integer> list = new ArrayList<>();
        // travering the each char of string
        for(char c : s.toCharArray()){

            // we need an increasing value so add the smallest available number
            if(c == 'I'){
                list.add(low);
                low++;
            // we need a decreasing value so add the largest available number
            }else{
                list.add(high);
                high--;
            }
        }
        // adding the last remaning no.
        list.add(low);
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}