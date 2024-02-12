//https://www.geeksforgeeks.org/problems/aggressive-cows/1?page=1&category=Binary%20Search&sortBy=submissions
class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low = 0;
        int high = stalls[n-1] - stalls[0];
        while(low <= high){
            int mid = (low + high)/2;
            if( place(stalls,mid,k) == true){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;
    }
    
    static boolean place(int[] arr, int mid, int cows){
        int countcows = 1;
        int last = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - last >= mid){
            countcows++;
            last = arr[i];
        }
        }
        if(countcows >= cows) return true;
        else return false;
    }
}
