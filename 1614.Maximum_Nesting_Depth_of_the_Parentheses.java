// Approach --- > 2

class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxDepth = 0;  // Track the maximum nesting depth
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
                maxDepth = Math.max(maxDepth, count); // Update max depth
            } else if (s.charAt(i) == ')') {
                count--;
            }
        }
        return maxDepth;
    }
}

// Approach --- > 2

class Solution {
    public int maxDepth(String s) {
        int max =0;
        int counter =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                counter++;
            }else if(s.charAt(i) == ')'){
                counter--;
            }
            max = Math.max(counter, max);
        }
        return max;
    }
}