class Solution {
    public void sortColors(int[] a) {
        int l = 0, m = 0, h = a.length - 1; // l: left, m: middle, h: right
        
        // Loop until mid crosses high
        while (m <= h) {
            if (a[m] == 0) {            // If current is red (0)
                swap(a, l++, m++);      // Swap to front, move both l & m
            }
            else if (a[m] == 1) {       // If current is white (1)
                m++;                    // Just move mid pointer
            }
            else {                      // If current is blue (2)
                swap(a, m, h--);        // Swap to end, move high pointer
            }
        }
    }
    
    // Swap helper function
    void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
