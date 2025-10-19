class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        // Queue for BFS traversal — to explore all possible transformations
        Queue<String> queue = new LinkedList<>();
        // Set to track visited strings and avoid revisiting states
        Set<String> visited = new HashSet<>();
        // Initialize the smallest string found so far as the original input
        String smallest = s;

        // Add the initial string to the queue and mark it as visited
        queue.offer(s);
        visited.add(s);

        // Perform BFS until all reachable states are explored
        while (!queue.isEmpty()) {
            String cur = queue.poll(); // Get the current string from the queue

            // Update the smallest string if the current one is lexicographically smaller
            if (cur.compareTo(smallest) < 0) {
                smallest = cur;
            }

            // ----- Operation 1: Add 'a' to all digits at odd indices -----
            char[] arr = cur.toCharArray();
            for (int i = 1; i < arr.length; i += 2) {
                int newDigit = ((arr[i] - '0') + a) % 10; // Add and wrap around (mod 10)
                arr[i] = (char) (newDigit + '0'); // Convert back to character
            }
            String added = new String(arr);

            // If this new string has not been visited, add it to the queue
            if (visited.add(added)) {
                queue.offer(added);
            }

            // ----- Operation 2: Rotate the string to the right by 'b' positions -----
            String rotated = cur.substring(cur.length() - b) + cur.substring(0, cur.length() - b);

            // If the rotated version is new, add it to the queue
            if (visited.add(rotated)) {
                queue.offer(rotated);
            }
        }

        // Return the lexicographically smallest string found
        return smallest;
    }
}
