class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int l =  digits.length;
        // Index for inserting elements into the result array
        int index = 0;
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
        int arr[] = new int[set.size()];
        for(int n: set){
            arr[index++] = n;
        }
        Arrays.sort(arr);
        return arr;
    }
}