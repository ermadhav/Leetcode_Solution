class Solution {
    public int[] decimalRepresentation(int n) {
            String s = String.valueOf(n);
            int[] ans = new int[s.length()];
            int count =0;
            // ones, twos...
            int place =1;
            // taverse from right to left
            for(int i=s.length()-1; i>=0 ;i--){
                int digit = s.charAt(i)-'0';
                // ignore 0s
                if(digit !=0){
                    ans[count++] = digit*place;
                }
                place *= 10;
            }
        int[] result = new int[count];
        for(int i=0; i<count; i++){
            result[i] = ans[count-1-i];
        }
        return result;
    }
}