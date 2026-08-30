class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum =0;
        int subSum =0;

        // Total sum of Array
        for(int i=0; i<cardPoints.length; i++){
            sum += cardPoints[i];
        }
        for(int i=0; i<cardPoints.length-k; i++){
            subSum += cardPoints[i];
        }
        int min = subSum;
        for(int i = cardPoints.length-k; i<cardPoints.length; i++){
            subSum += cardPoints[i];
            subSum -= cardPoints[i- (cardPoints.length-k)];
            min = Math.min(min, subSum);
        }
        return sum - min;
    }
}