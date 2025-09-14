class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        // Exact word match
        Set<String> exact = new HashSet<>(Arrays.asList(wordlist));

        // Case match
        Map<String, String> cap = new HashMap<>();

        // Vowel match
        Map<String, String> vow = new HashMap<>();

        // Prepare maps
        for (String w : wordlist) {
            String low = w.toLowerCase();
            cap.putIfAbsent(low, w); 
            vow.putIfAbsent(low.replaceAll("[aeiou]", "*"), w);
        }

        String[] ans = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];

            if (exact.contains(q)) ans[i] = q; // exact
            else if (cap.containsKey(q.toLowerCase())) ans[i] = cap.get(q.toLowerCase()); // case
            else ans[i] = vow.getOrDefault(q.toLowerCase().replaceAll("[aeiou]", "*"), ""); // vowel
        }
        return ans;
    }
}
