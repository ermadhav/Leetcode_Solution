// Import necessary classes from java.time package
import java.time.LocalDate;                  // Represents a date (year, month, day)
import java.time.temporal.ChronoUnit;        // Used to calculate time between two dates

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        // Parse the string inputs ("YYYY-MM-DD") into LocalDate objects
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        // Calculate the number of days between the two dates using ChronoUnit.DAYS
        // The result can be negative, so we use Math.abs() to ensure a positive value
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
}
