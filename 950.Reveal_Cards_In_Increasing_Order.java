class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] result = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        for(int i = 0; i < deck.length; i++){
            q.add(i);
        }
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