class Solution {
    public String reversePrefix(String s, int k) {

        // converted String into Char Array
        char[] arr = s.toCharArray();


        int l = 0; // left
        int r = k - 1; // right = k-1 (0-Indexed)

        while (l < r) {

            // swapping
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;


            l++; // incrs left
            r--;
        }
        return new String(arr);
    }
}