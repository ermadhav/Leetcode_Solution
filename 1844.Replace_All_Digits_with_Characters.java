class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();

        // odd index per ditis hai
        for(int i=1; i<arr.length; i+=2){

            // char --> int conversion
            int digit = arr[i] - '0';

            // eg a+1 = b
            arr[i] = (char)(arr[i-1]+digit);
        }
        return new String(arr);
    }
}