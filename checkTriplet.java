//https://www.geeksforgeeks.org/problems/pythagorean-triplet3018/1?page=1&category=Arrays&difficulty=Medium&status=unsolved&sortBy=submissions
class Solution {
    boolean checkTriplet(int[] arr, int n) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i =0; i<n; i++){
            set.add(arr[i]*arr[i]);
        }
        
        for(int i : set){
            for(int j set){
                if(set.contains(i+j)){
                    return true;
                }
            }
        }
        return false;
        
    }
}
