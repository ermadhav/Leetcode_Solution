class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];         // count[0]=circular, count[1]=square
        for (int s : students) count[s]++; // count preferences
        for (int sw : sandwiches) {        // check each sandwich
            if (count[sw] == 0) break;     // nobody wants this type → stop
            count[sw]--;                   // student takes it
        }
        return count[0] + count[1];        // students left hungry
    }
}
