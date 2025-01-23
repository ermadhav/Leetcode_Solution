class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int totalCollectionTime = 0;
        int lastMetal = 0, lastPaper = 0, lastGlass = 0;
        int n = garbage.length;

        // Calculate total collection time and find last house for each garbage type
        for (int i = 0; i < n; i++) {
            totalCollectionTime += garbage[i].length(); // Time to collect all garbage at house i
            if (garbage[i].contains("M")) {
                lastMetal = i;
            }
            if (garbage[i].contains("P")) {
                lastPaper = i;
            }
            if (garbage[i].contains("G")) {
                lastGlass = i;
            }
        }

        // Calculate travel times
        int totalTravelTime = 0;
        totalTravelTime += calculateTravelTime(travel, lastMetal);
        totalTravelTime += calculateTravelTime(travel, lastPaper);
        totalTravelTime += calculateTravelTime(travel, lastGlass);

        return totalCollectionTime + totalTravelTime;
    }

    private int calculateTravelTime(int[] travel, int lastHouse) {
        int travelTime = 0;
        for (int i = 0; i < lastHouse; i++) {
            travelTime += travel[i];
        }
        return travelTime;
    }
}
