//https://www.geeksforgeeks.org/problems/maximum-point-you-can-obtain-from-cards/1
class Solution {
    static long maxScore(int cardPoints[], int n, int k) {
        int  maxLen = 0, lsum = 0, rsum = 0;
       
      //  int n = cardPoints.length;
        if(n < k) return -1;
        for(int i = 0; i<k; i++) lsum += cardPoints[i];
        maxLen = lsum;
        int rindex = n-1;
        for(int i = k-1; i>=0; i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[rindex];
            --rindex;

            //maxLen = Math.max(maxLen, lsum+rsum );
            if(maxLen < lsum+rsum) maxLen = lsum+rsum;
        } 
       return maxLen;
    }
}
