class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[2051]; // For years 1950–2050
        
        for (int[] log : logs) {
            population[log[0]]++;   // Birth year adds one
            population[log[1]]--;   // Death year subtracts one
        }
        
        int maxYear = 1950;
        int maxPop = 0;
        int currentPop = 0;
        
        for (int year = 1950; year <= 2050; year++) {
            currentPop += population[year];
            if (currentPop > maxPop) {
                maxPop = currentPop;
                maxYear = year;
            }
        }
        
        return maxYear;
    }
}
