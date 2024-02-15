

//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long maxSum = Long.MIN_VALUE;
        int i = 0, j = 0;
        long windowSum = 0;
        
        while(j < N){
            windowSum += Arr.get(j);
            
            if((j-i+1) == K){
                maxSum = Math.max(windowSum,maxSum);
                windowSum -= Arr.get(i);
                i++;
            }
            j++;
        }
        return maxSum;
    
    }
}
