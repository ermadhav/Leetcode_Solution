class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] result = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        for(int n : deck){
            q.add(n);
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