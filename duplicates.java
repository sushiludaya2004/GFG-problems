//https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution {
    int remove_duplicate(int A[],int N){
        int i = 0;
        for(int j = 1; j < N; j++){
            if(A[j] != A[i]){
                A[i+1] = A[j];
                i++;
            }
        }
        return i+1;
    }
}
