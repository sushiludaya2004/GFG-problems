//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int ans = -1;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                ans = i;
            }
            else{
                break;
            }
        }
        return ans;
    }
    
}
