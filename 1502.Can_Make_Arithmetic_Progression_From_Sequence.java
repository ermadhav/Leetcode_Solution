import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];  // Notice: arr[1] - arr[0]

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i+1] - arr[i] != diff) {
                return false;  // Immediately return false if any gap is wrong
            }
        }
        return true;  // If loop finishes, it's a valid arithmetic progression
    }
}
