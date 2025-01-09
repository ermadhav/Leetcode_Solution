import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {

         // Initialize an empty string
        String sum = "";

         // Loop through each word
        for(int i=0; i<words.size(); i++){
                sum += words.get(i).charAt(0);// Append the first character of each word to sum
        }

        // Check if the formed acronym matches the given string
        if(sum.equals(s)){
            return true;
        }else{
            return false;
        }  
    }
}