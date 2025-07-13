class Solution {
    public double angleClock(int hour, int minutes) {
        // Normalize hour
        hour = hour % 12;

        // Calculate angles
        double minuteAngle = minutes * 6; // 6 degrees per minute
        double hourAngle = hour * 30 + minutes * 0.5; // 30 degrees per hour + 0.5 per minute

        // Find the difference
        double angle = Math.abs(hourAngle - minuteAngle);

        // Return the smaller angle
        return Math.min(angle, 360 - angle);
    }
}