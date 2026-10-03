class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for(int i=0; i<=num.length()-3; i++){
            // check if 3 consecutive digits are the same
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                String curr = num.substring(i, i+3);
                // compare with current maximum
                if(curr.compareTo(ans)>0){
                    ans = curr;
                }
            }
        }
        return ans;
    }
}