//https://www.geeksforgeeks.org/problems/key-pair5616/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // for(int i = 0; i < n; i++){
        //     for(int j = i+1; j < n; j++){
        //         if(arr[i] + arr[j] == x) return true;
        //     }
        // }
        // return false;
        Arrays.sort(arr);
        int i = 0, j = n-1;
        while(i != j){
            if((arr[i] + arr[j]) == x) return true;
            else if((arr[i] + arr[j]) < x) i++;
            else j--;
        }
        return false;
    }
}
