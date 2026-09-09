class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0,maxsum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        maxsum=sum;
        int rightindex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            sum=sum-cardPoints[i]+cardPoints[rightindex];
            rightindex--;
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
    
}
