//https://www.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions
class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            if(hm.get(a[i])>=k){
              return a[i];
            }
        }
            
        return -1;
        
    } 
}
