class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX.VALUE;

        for(int[] task:tasks){
            int finishTime = task[0]+task[1];
            min = Math.min(min, finishTime);
        }
        return min;
    }
}