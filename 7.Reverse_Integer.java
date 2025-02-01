class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x)));
        sb.reverse();
        int lastElement = sb.charAt(sb.length() -1);
        if(lastElement == 0){
            sb.delete(sb.length() - 1, sb.length()); 
        } else if(x<0){
            sb.insert(0, '-');
        }
         try {
            return Integer.parseInt(sb.toString()); 
        } catch (NumberFormatException e) {
            return 0; 
        }        
    }
}