class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] result = new int[deck.length];

        // Queue mein array ke indices store karenge
        Queue<Integer> q = new LinkedList<>();
         // Cards ko increasing order mein sort karo
        Arrays.sort(deck);
        // Queue mein saare indices add karo
        for(int i = 0; i < deck.length; i++){
            q.add(i);
        }
        // Smallest card se start karke positions fill karo
        for(int card: deck){
            int index = q.poll();
            result[index] = card;
            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }
        return result;
    }
}