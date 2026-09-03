class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // used to count the freq
        for( char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        // traverse the string to find 1st char with freq 1
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            // if found return the index
            if(map.get(ch) == 1){
                return i;
            }
        }
        
        return -1;
    }
}