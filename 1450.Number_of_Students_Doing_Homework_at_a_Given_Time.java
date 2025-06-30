class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0; // Initialize counter for students doing homework at queryTime
        
        // Loop through each student
        for (int i = 0; i < startTime.length; i++) {
            // Check if queryTime falls within the student's homework time interval
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++; // Increment count if student is busy at queryTime
            }
        }
        
        return count; // Return the total number of busy students
    }
}
