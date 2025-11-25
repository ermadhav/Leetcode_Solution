class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {

        // Check bulky: any dimension ≥ 10^4 or volume ≥ 10^9
        boolean bulky = length >= 1e4 || width >= 1e4 || height >= 1e4
                        || (long) length * width * height >= 1e9;

        // Check heavy: mass ≥ 100
        boolean heavy = mass >= 100;

        // Determine category
        if (bulky && heavy) return "Both";
        if (!bulky && !heavy) return "Neither";
        return bulky ? "Bulky" : "Heavy";
    }
}
