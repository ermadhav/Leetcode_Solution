class Solution {

    // Days in each month (non-leap year)
    private static final int[] DAYS = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                  String arriveBob, String leaveBob) {

        // Convert all dates to day of year
        int aStart = dayOfYear(arriveAlice);
        int aEnd   = dayOfYear(leaveAlice);
        int bStart = dayOfYear(arriveBob);
        int bEnd   = dayOfYear(leaveBob);

        // Find overlap range
        int start = Math.max(aStart, bStart);
        int end   = Math.min(aEnd, bEnd);

        // Return number of common days
        return Math.max(0, end - start + 1);
    }

    // Converts "MM-DD" to day number in year
    private int dayOfYear(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int total = day;
        // Add days of previous months
        for (int i = 0; i < month - 1; i++) {
            total += DAYS[i];
        }
        return total;
    }
}
