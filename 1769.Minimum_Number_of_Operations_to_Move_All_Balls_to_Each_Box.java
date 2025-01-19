class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        
        // First pass: Calculate operations moving from left to right
        int count = 0; // Number of balls encountered so far
        int operations = 0; // Operations needed to move balls to current position

        for (int i = 0; i < n; i++) {
            answer[i] += operations;
            if (boxes.charAt(i) == '1') {
                count++;
            }
            operations += count; // Increment operations based on balls encountered so far
        }
        // Second pass: Calculate operations moving from right to left
        count = 0;
        operations = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += operations;
            if (boxes.charAt(i) == '1') {
                count++;
            }
            operations += count; // Increment operations based on balls encountered so far
        }
        
        return answer;
    }
}
