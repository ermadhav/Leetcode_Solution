class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);     // Sort seats
        Arrays.sort(students);  // Sort students
        int res = 0;
        for(int i = 0; i < seats.length; i++) {
            res += Math.abs(seats[i] - students[i]); // Add moves needed
        }
        return res; // Return total moves
    }
}
