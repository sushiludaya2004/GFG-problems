//https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1?page=1&category=Queue&sortBy=submissions
class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        Queue<Long> q = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            q.offer(arr[i]);
        }
        long minCost = 0;
        while(q.size() > 1){
            long total = q.poll() + q.poll();
            minCost += total;
            q.offer(total);
        }
        return minCost;
    }
}
