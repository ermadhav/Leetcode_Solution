class Solution {
    public boolean checkRecord(String s) {
        int absents = 0;       // Counter for total number of absences
        int lateStreak = 0;    // Counter for consecutive late days

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // Get the current character

            if (ch == 'A') {
                absents++;          // Increment absence counter
                if (absents >= 2) {
                    return false;   // More than 1 absence — not eligible
                }
                lateStreak = 0;     // Reset late streak after absence
            } else if (ch == 'L') {
                lateStreak++;       // Increase the consecutive late counter
                if (lateStreak >= 3) {
                    return false;   // 3 or more consecutive lates — not eligible
                }
            } else {
                lateStreak = 0;     // Reset late streak on present day
            }
        }

        return true; // Passed all checks — student is eligible
    }
}
