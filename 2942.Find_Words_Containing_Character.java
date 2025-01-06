import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        // List to store indices of words containing character x
        List<Integer> indices = new ArrayList<>();
        for(int i=0; i<words.length; i++){

            
            // Check if the word contains the character x
            if(words[i].indexOf(x) != -1)  
            indices.add(i);         // Add the index to the list if the character is found

        }
        return indices;
    }
}