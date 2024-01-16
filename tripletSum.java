//https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
        Arrays.sort(A);
        for(int i = 0; i < n; i++){
            int j = i + 1;
            int k = n - 1;
            
            while(j < k){
                int sum = A[i] + A[j] + A[k];
                if(sum < X) j++;
                else if(sum > X) k--;
                else return true;
            }
        }
        return false;

    }
}
