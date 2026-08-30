class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int subSum = 0;

        // Total sum of Array
        for (int i = 0; i < cardPoints.length; i++) {
            sum += cardPoints[i];
        }

        // N = cardPoints.length
        // Hume N-k cards ko remove/leave karna hai
        // Starting window ka sum calculate kar rahe hain
        for (int i = 0; i < cardPoints.length - k; i++) {
            subSum += cardPoints[i];
        }

        // Pehli window ko minimum maan rahe hain
        int min = subSum;

        // Sliding window use karke minimum sum find kar rahe hain

        for (int i = cardPoints.length - k; i < cardPoints.length; i++) {

            // Window mein new element add karo
            subSum += cardPoints[i];
            // Window se purana element remove karo
            subSum -= cardPoints[i - (cardPoints.length - k)];
            // Minimum window sum update karo
            min = Math.min(min, subSum);
        }
        return sum - min;
    }
}