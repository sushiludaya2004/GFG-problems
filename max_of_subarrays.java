//https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1?page=1&category=sliding-window&sortBy=submissions
class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        // ArrayList<Integer> a=new ArrayList<>();
        // for(int i=0;i<=n-k;i++){
        //     int max=arr[i];
        //     for(int j=i+1;j<i+k;j++){
        //         if(max<arr[j]){
        //             max=arr[j];
        //         }
        //     }
        //     a.add(max);
        // }
        // return a;
        
        ArrayList <Integer> a = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i<n; i++){
            //remove numbers out of bound
            if(!q.isEmpty() && q.peek() <= i-k) q.poll();
            //remove smaller numbers in k range as they are useless
            while(!q.isEmpty() && arr[q.peekLast()] <= arr[i])  q.pollLast();
            //adding index of arr
            q.offer(i);
            
            if(i >= k-1){
                a.add(arr[q.peek()]);
            }
        }
        return a;
        
    }
}
