class Solution {
    public String reversePrefix(String s, int k) {

        // converted String into Char Array
        char[] arr = s.toCharArray();

        int l = 0;
        int r = k - 1;

        while (l < r) {

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}