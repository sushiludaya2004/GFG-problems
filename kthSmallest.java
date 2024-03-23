//https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1?page=1&category=Arrays&difficulty=Medium&sortBy=submissions
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=l; i<=r; i++){
            pq.add(arr[i]);
        }
        while(k>1){
          pq.poll();
          k--;
        }
        return pq.peek();
        
        
        // Arrays.sort(arr);
        // return arr[k-1];
    } 
}
