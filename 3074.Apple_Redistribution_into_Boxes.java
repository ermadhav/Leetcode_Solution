class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);

        int num =0;

        // total no. of apple
        for(int i=0; i<apple.length; i++){
            num += apple[i];
        }

        int cap =0;
        int count =0;

        // start from biggest box and add one by one 
        for(int i= capacity.length-1; i>=0; i--){
            cap += capacity[i]; // add curr box capicity
            count++;
            if(cap >= num){
                return count;
            }
        }
        return count;
    }
}