//https://www.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1?page=1&difficulty=Medium&status=unsolved&sortBy=submissions
class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int a[], int n) {
        // code here
        ArrayList<ArrayList<Integer>>res = new ArrayList<>();
        
        int i=0;
        
        while(i<n-1)
        {
            while(i<n-1 && a[i] >= a[i+1])
            i++;
            
            if(i==n-1)
                break;
                
                
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(i);
            i++;
            
            
            while(i<n && a[i]>=a[i-1])
            i++; 
            
            temp.add(i-1);
        
        res.add(temp);
        }
        return res;
    }
}
