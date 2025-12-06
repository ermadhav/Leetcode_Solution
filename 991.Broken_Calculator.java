class Solution {
    public int brokenCalc(int startValue, int target) {
        int operations = 0;

        while (target > startValue) {
            operations++;
            if (target % 2 == 1) {
                target++;        // reverse of subtract 1
            } else {
                target /= 2;     // reverse of multiply by 2
            }
        }

        return operations + (startValue - target);
    }
}
