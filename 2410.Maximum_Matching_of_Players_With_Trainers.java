class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j =0; 
        int count =0;
        // running the loop into players and trainers 
        while(i<players.length && j< trainers.length){
            if(players[i] <= trainers[j]){
                    count++; // if matches incrs the count by 1;
                    // incrs the i and j too for the next player and trainer
                    i++;
                    j++;
            }else{
                    j++; // change the trainer without changing the player
            }
        }
        return count;
    }
}