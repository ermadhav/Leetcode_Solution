class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(int i = 0; i < sentences.length ; i++){
            int count = 1;
            // Count the spaces in the sentence 
            for(int j = 0; j< sentences[i].length(); j++){
                if(sentences[i].charAt(j) ==' '){
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}