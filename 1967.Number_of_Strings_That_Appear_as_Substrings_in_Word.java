class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0;

        // Iterating over each string in the patterns array.
       for(int i=0; i<patterns.length; i++){

        //Checking if word contains any letter of patterns
        if(word.contains(patterns[i])){
            count++;
        }
       }
       return count; 
    }
}