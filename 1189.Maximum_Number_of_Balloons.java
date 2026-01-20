class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];

        // Count frequency of each character in text
        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }

        // "balloon" needs:
        // b = 1, a = 1, l = 2, o = 2, n = 1
        int balloons = Integer.MAX_VALUE;

        balloons = Math.min(balloons, count['b' - 'a'] / 1);
        balloons = Math.min(balloons, count['a' - 'a'] / 1);
        balloons = Math.min(balloons, count['l' - 'a'] / 2);
        balloons = Math.min(balloons, count['o' - 'a'] / 2);
        balloons = Math.min(balloons, count['n' - 'a'] / 1);

        return balloons;
    }
}
