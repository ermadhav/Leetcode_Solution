class Solution {
    public double[] convertTemperature(double celsius) {
        // Convert Celsius to Kelvin
        double Kelvin = celsius + 273.15;
        // Convert Celsius to Fahrenheit
        double Fahrenheit = celsius * 1.80 + 32.00;

        double[] ans = {Kelvin, Fahrenheit};
        return ans;
    }
}