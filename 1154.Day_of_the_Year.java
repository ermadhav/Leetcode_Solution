class Solution {
    public int dayOfYear(String date) {
        // Split the date string into year, month, and day
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        // Days in each month for a non-leap year
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year and adjust February
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        // Sum the days of the previous months
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        // Add the current day
        dayOfYear += day;

        return dayOfYear;
    }

    private boolean isLeapYear(int year) {
        // Leap year rule: divisible by 4 and not by 100, unless also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
