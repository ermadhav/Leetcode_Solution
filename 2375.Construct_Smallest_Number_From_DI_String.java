class Solution {
    public String smallestNumber(String pattern) {

        StringBuilder ans = new StringBuilder(); // to build final answer
        Stack<Integer> stack = new Stack<>();    // stack to handle 'D' pattern
        int num = 1;                             // smallest available digit

        // loop till pattern length (n) to make n+1 digits
        for (int i = 0; i <= pattern.length(); i++) {

            stack.push(num); // push current number
            num++;           // move to next number

            // if 'I' found or at end, pop all from stack
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    ans.append(stack.pop()); // add to answer
                }
            }
        }

        return ans.toString(); // return final smallest number
    }
}