class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        // stores the ans for each day
        int[] ans = new int[temperatures.length];
        // stack stores the indexes od days
        Stack<Integer> stack = new Stack<>(); 
        for(int i=0; i<temperatures.length; i++){
            // find the next warmer day 
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prev = stack.pop();
                ans[prev] = i-prev;
            }
            stack.push(i);
        }
        return ans;
    }
}