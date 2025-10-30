class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Combine both sentences
        String combined = s1 + " " + s2;
        // Split into words
        String[] words = combined.split(" ");
        // Count frequency of each word
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        // Collect words that appear exactly once
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        // Return as array
        return result.toArray(new String[0]);
    }
}
