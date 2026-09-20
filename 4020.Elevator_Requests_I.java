class Solution {
    public int elevatorRequests(int n, int[] requests) {

        // dist from 1st floor to first req
        int ans =requests[0];

        // then other requests
        for(int i=1; i<requests.length; i++){
            ans += Math.abs(requests[i]-requests[i-1]);
        }
        return ans;
    }
}