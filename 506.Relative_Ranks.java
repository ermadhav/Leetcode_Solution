class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        // store score and original index
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = score[i]; // athlete score
            arr[i][1] = i;        // original position
        }

        // sort by score in descending order
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        String[] answer = new String[n];

        // assign ranks based on sorted position
        for(int i = 0; i < n; i++){
            int idx = arr[i][1]; // original index

            if(i == 0){
                answer[idx] = "Gold Medal";
            }else if(i == 1){
                answer[idx] = "Silver Medal";
            }else if(i == 2){
                answer[idx] = "Bronze Medal";
            }else{
                answer[idx] = String.valueOf(i + 1); // rank number
            }
        }

        return answer;
    }
}
