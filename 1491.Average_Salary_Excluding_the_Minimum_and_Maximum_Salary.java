import java.util.Arrays;

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);              // Sort the salaries
        int n = salary.length;

        int min = salary[0];              // Minimum salary
        int max = salary[n - 1];          // Maximum salary
        
        int sum = 0;
        for (int s : salary) {
            sum += s;                     // Calculate total sum
        }
        
        sum -= (min + max);               // Remove min and max from sum
        
        return (double) sum / (n - 2);    // Return average of remaining
    }
}
