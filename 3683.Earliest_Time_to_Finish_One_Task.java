class Solution {
    public int earliestTime(int[][] tasks) {

        // minimum finishing time ko store kara hai
        int min = Integer.MAX_VALUE;

        // Check each task
        for(int[] task:tasks){

            // Finish time = start time + duration
            int finishTime = task[0]+task[1];

            min = Math.min(min, finishTime);
        }
        return min;
    }
}