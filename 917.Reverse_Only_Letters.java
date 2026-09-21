// Same Logic Behind 

class Solution {
    public String reverseOnlyLetters(String s) {

        // store letter and char separately
        List<Character> letter = new ArrayList<>();
        List<Character> special = new ArrayList<>();

        // separate the letter and spcl char separetly
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                letter.add(ch);
            }else{
                special.add(ch);
            }
        }
        // reverse only the letter
        Collections.reverse(letter);

        StringBuilder ans = new StringBuilder();
        int l=0; // for letter
        int spcl =0; // 

        // using this for og postion
        for(char ch : s.toCharArray()){
            // if char is letter then put the reversed 
            if(Character.isLetter(ch)){
                ans.append(letter.get(l));
                l++;
            }else{
                ans.append(special.get(spcl));
                spcl++;
            }
        }
        return ans.toString();
    }
}