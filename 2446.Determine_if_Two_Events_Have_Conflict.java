class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int start1 = parseTime(event1[0]);
        int end1 = parseTime(event1[1]);
        int start2 = parseTime(event2[0]);
        int end2 = parseTime(event2[1]);

        // Check if the two events overlap
        return start1 <= end2 && start2 <= end1;
    }

    // Helper method to parse time in HH:MM format into total minutes
    int parseTime(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
