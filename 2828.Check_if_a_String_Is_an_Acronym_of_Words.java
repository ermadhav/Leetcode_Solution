import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
         // Initialize an empty string
        String sum = "";


        for(int i=0; i<words.size(); i++){
                sum += words.get(i).charAt(0);
        }
        if(sum.equals(s)){
            return true;
        }else{
            return false;
        }  
    }
}