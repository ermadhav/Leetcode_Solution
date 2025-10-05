class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> list = new ArrayList<>();
        
        // Convert each time to total minutes
        for (String t : timePoints) {
            String[] p = t.split(":");
            list.add(Integer.parseInt(p[0]) * 60 + Integer.parseInt(p[1]));
        }
        
        // Sort times
        Collections.sort(list);
        
        int min = 1440; // Max possible difference (24h)
        
        // Find min difference between adjacent times
        for (int i = 1; i < list.size(); i++)
            min = Math.min(min, list.get(i) - list.get(i - 1));
        
        // Check circular difference (last → first)
        return Math.min(min, 1440 - list.get(list.size() - 1) + list.get(0));
    }
}
