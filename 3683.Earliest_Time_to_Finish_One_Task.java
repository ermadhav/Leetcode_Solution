class Solution {
    public int earliestTime(int[][] tasks) {

        // Store the minimum finishing time
        int min = Integer.MAX_VALUE;

        // Check each task
        for(int[] task:tasks){

            // Finish time = start time + duration
            int finishTime = task[0]+task[1];

            // Update minimum finish time
            min = Math.min(min, finishTime);
        }
        return min;
    }
}