class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for(int i=0; i<nums.length()-3; i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                String curr = num.substring(i, i+3);
                if(curr.compareTo(ans)>0){
                    ans = curr;
                }
            }
        }
        return ans;
    }
}