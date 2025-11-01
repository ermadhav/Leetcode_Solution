class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Create a set of banned words (in lowercase)
        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) bannedSet.add(b.toLowerCase());

        // Map to store word frequency
        Map<String, Integer> count = new HashMap<>();

        // Convert paragraph to lowercase, remove non-alphabetic chars, and split into words
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");

        // Count frequency of each non-banned word
        for (String word : words) {
            if (!bannedSet.contains(word) && !word.isEmpty())
                count.put(word, count.getOrDefault(word, 0) + 1);
        }

        // Find the most frequent word
        String res = "";
        int max = 0;
        for (Map.Entry<String, Integer> e : count.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                res = e.getKey();
            }
        }

        // Return the most common non-banned word
        return res;
    }
}
