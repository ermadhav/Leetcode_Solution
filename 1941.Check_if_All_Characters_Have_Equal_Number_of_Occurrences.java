// Aproach --> 1

class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // counting freq of each char
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int freq =-1;

        // checking if all char has same freq
        for(int f : map.values()){

            // storing the first freq
            if(freq == -1){
                freq = f;

                // if any freq is diff return false
            }else if(freq != f){
                return false;
            }
        }
        return true;
    }
}


// Aproach --> 2