class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;

        while (mainTank > 0) {
            // Use 1 liter at a time
            mainTank--;
            distance += 10;

            // Every time 5 liters have been used, try to add from additional tank
            if (distance % 50 == 0 && additionalTank > 0) {
                mainTank += 1;   // add 1 liter to main tank
                additionalTank--; 
            }
        }

        return distance;
    }
}
