class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int l =  digits.length;
        // Index for inserting elements into the result array
        int index = 0;

        // will be used to avoid duplicate
        Set<Integer> set = new HashSet<>();

        // first digit(100th place)
        for(int i=0; i<l; i++){
            // second digit(10th place)
            for(int j=0; j<l; j++){
                // third digit(1st place)
                for(int k=0; k<l; k++){

                    // All 3 posn is diff, not a leading zero, last digit is even
                    if(i != j && j != k && i != k && digits[i] != 0 && digits[k]%2 == 0){
                        // create a three digit no.
                        set.add(digits[i]*100 + digits[j]*10 + digits[k]);
                    }
                }
            }
        }

        // arr with set size
        int arr[] = new int[set.size()];

        // copy set no. into arr
        for(int n: set){
            arr[index++] = n;
        }

        // sort (req)
        Arrays.sort(arr);
        return arr;
    }
}