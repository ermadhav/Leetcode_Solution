class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        StringBuilder ans = new StringBuilder();

        // Process every word
        for(String word : words){


            int sum =0;

            //add weights of every word
            for(char ch : word.toCharArray()){

                int index = ch - 'a';
                sum += weights[index];

            }

            int value = sum % 26;

            //reverse alphabet mapping 
            char mapped = (char)('a' + (25 - value));
            ans.append(mapped);
        }

        return ans.toString();
    }
}