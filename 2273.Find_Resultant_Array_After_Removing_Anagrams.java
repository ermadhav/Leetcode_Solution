class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>(); // result list
        String prev = ""; // previous word's sorted form
        
        for (String w : words) {
            char[] c = w.toCharArray();
            Arrays.sort(c); // sort to check anagram
            String s = new String(c);
            
            if (!s.equals(prev)) { // if not anagram of previous
                res.add(w);
                prev = s; // update previous
            }
        }
        return res; // return list without consecutive anagrams
    }
}
