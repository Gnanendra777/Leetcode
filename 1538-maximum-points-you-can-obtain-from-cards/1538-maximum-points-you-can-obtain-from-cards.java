class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum =0;
        
        for(int i =0; i < k; i++){
            leftSum = leftSum + cardPoints[i];
        }
        int maxSum = leftSum;
        int rightSum =0;
        int rightIndex = n- 1;
        for(int i = k-1; i >= 0; i--){
            leftSum = leftSum - cardPoints[i];
            rightSum = rightSum + cardPoints[rightIndex];
            rightIndex = rightIndex -1;
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        return maxSum;
    }
}