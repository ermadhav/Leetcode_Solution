class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // If total cards can't be evenly grouped
        if (hand.length % groupSize != 0) return false;

        // Count cards and keep them sorted
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int card : hand)
            map.put(card, map.getOrDefault(card, 0) + 1);

        // Form groups starting from smallest card
        while (!map.isEmpty()) {
            int first = map.firstKey();
            for (int i = 0; i < groupSize; i++) {
                int curr = first + i;
                if (!map.containsKey(curr)) return false; // missing card
                map.put(curr, map.get(curr) - 1);
                if (map.get(curr) == 0) map.remove(curr); // remove used card
            }
        }
        return true; // all cards grouped
    }
}
