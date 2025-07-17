class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0, num = 1;

        // Loop until k missing numbers are found
        while (k > 0) {
            if (i < arr.length && arr[i] == num) 
                i++;           // Number exists in array, move to next
            else 
                k--;           // Number is missing, count it
            if (k > 0) 
                num++;         // Move to next number if k not yet 0
        }

        return num;            // k-th missing number
    }
}
