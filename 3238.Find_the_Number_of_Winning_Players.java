class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];

            map.putIfAbsent(player, new HashMap<>());
            Map<Integer, Integer> colors = map.get(player);

            colors.put(color, colors.getOrDefault(color, 0) + 1);
        }

        int winners = 0;

        for (int player : map.keySet()) {
            for (int count : map.get(player).values()) {
                if (count > player) {
                    winners++;
                    break;
                }
            }
        }

        return winners;
    }
}