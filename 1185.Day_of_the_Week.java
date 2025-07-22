class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        // If month is January or February, treat it as 13th or 14th month of previous year
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int k = year % 100;      // Year within the century
        int j = year / 100;      // Zero-based century

        // Zeller's formula to calculate day of the week
        int f = day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j);

        int dayOfWeek = f % 7;   // Day of week number according to Zeller's output

        // Map Zeller's output to actual day names
        // 0=Saturday, 1=Sunday, 2=Monday, ..., 6=Friday
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        return days[dayOfWeek];  // Return the corresponding day name
    }
}