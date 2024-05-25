//https://www.geeksforgeeks.org/problems/you-and-your-books/1
class Solution {
    long max_Books(int arr[], int n, int k) {
        // Your code here
        long curr=0;
        long maxi=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                curr += arr[i];
                maxi = Math.max(maxi,curr);
            }
            else{
                curr=0;
            }
        }
        return maxi;
    }
}

