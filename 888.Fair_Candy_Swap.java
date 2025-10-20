class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for (int a : aliceSizes) sumA += a;
        for (int b : bobSizes) sumB += b;

        int delta = (sumA - sumB) / 2; 
        Set<Integer> setA = new HashSet<>();
        for (int a : aliceSizes) setA.add(a);

        for (int b : bobSizes) {
            int a = b + delta;
            if (setA.contains(a)) {
                return new int[]{a, b};
            }
        }
        return new int[0];
    }
}