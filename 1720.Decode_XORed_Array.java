class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length+1;
        int[] arr = new int[n];
        arr[0] = first;
        for(int i=0; i<n-1; i++){
            arr[i + 1] = arr[i] ^ encoded[i]; // decode using XOR
        }
        return arr;
    }
}