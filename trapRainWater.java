https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution{
    static long trappingWater(int arr[], int n) { 
        int left=0;
        int right=n-1;
        long res=0;
        int leftmax=0;
        int rightmax=0;
        
        while(left<=right){
            
            if(arr[left]<=arr[right]){
                if(arr[left]>=leftmax){
                    leftmax=arr[left];
                }else{
                    res+=leftmax-arr[left];
                }
                left++;
            }
            
            else{
                if(arr[right]>=rightmax){
                    rightmax=arr[right];
                }else{
                    res+=rightmax-arr[right];
                } 
                right--;
            }
        }
        return res;
        
    } 

}
