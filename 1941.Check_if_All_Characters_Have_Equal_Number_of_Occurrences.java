class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int freq =-1;
        for(int f : map.values()){
            if(freq == -1){
                freq = f;
            }else if(freq != f){
                return false;
            }
        }
        return true;
    }
}