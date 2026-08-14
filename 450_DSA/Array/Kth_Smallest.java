class Solution {
    public int kthSmallest(int[] arr, int k) {

        // sort karke kth-1(0th index that's why) element return karde
        Arrays.sort(arr);
        return arr[k-1];


        // <----------Max :- [n-k] --------->
    }
}
