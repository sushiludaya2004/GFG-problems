//https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=1&category=Arrays&difficulty=Basic,Easy&sortBy=submissions
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        int count=0;
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(map.containsKey(k-num)){
                count+=map.get(k-num);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
         return count;
    }
}
