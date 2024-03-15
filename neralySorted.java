//https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1?page=3&category=Arrays&difficulty=Medium
class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        // your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList <Integer>list = new ArrayList<>();
        int j=0;
        for(int i=0;i<num;i++){
            minHeap.add(arr[i]);
            //if(minHeap.size()>k) list.add(minHeap.poll());
        }
        while(minHeap.size()!=0){
            list.add(minHeap.poll());
        }
        return list;
    }
}
