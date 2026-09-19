class Solution {
    public int minimumChairs(String s) {
        int chair =0;
        int enter =0;
        for(int i=0; i<s.length(); i++)   {
            if(s.charAt(i) == 'E'){
                enter++;
                chair = Math.max(chair, enter);
            }else{
                enter--;
            }
        }
        return chair;
    }
}