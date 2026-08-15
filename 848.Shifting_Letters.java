class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] arr = s.toCharArray();

        // stores the total shift of curr char
        int shift = 0;

        // piche se aage traverse 
        for(int i = shifts.length-1; i>= 0; i--){
            shift =  (shift + shifts[i])%26;
            arr[i] = (char) ((arr[i] - 'a' + shift) % 26 + 'a');
        }
        return new String(arr);
    }
}   