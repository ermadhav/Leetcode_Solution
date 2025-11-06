class Solution {
    public String sortString(String s) {
        int[] freq = new int[26]; // count characters
        
        // store frequency of each character
        for(char c : s.toCharArray())
            freq[c - 'a']++;

        StringBuilder result = new StringBuilder();
        int total = s.length();

        while(result.length() < total){

            // Step 1 & 2: pick smallest to largest
            for(int i = 0; i < 26; i++){
                if(freq[i] > 0){
                    result.append((char)(i + 'a'));
                    freq[i]--;
                }
            }

            // Step 4 & 5: pick largest to smallest
            for(int i = 25; i >= 0; i--){
                if(freq[i] > 0){
                    result.append((char)(i + 'a'));
                    freq[i]--;
                }
            }
        }

        return result.toString();
    }
}
