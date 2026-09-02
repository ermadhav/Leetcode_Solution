class Solution {
    public int totalNumbers(int[] digits) {

        int l = digits.length;

        // store the unique numbers
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<l; i++){
            for(int j=0; j<l; j++){
                for(int k=0; k<l; k++){
                    if(i != j && j != k && i != k && digits[i] != 0 && digits[k]%2 == 0){
                        set.add(digits[i]*100 + digits[j]*10 + digits[k]);
                    }
                }
            }
        }
        return set.size();
    }
}