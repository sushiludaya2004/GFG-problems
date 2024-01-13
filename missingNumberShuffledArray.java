//https://www.geeksforgeeks.org/problems/missing-number-in-shuffled-array0938/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
//missingNumberShuffledArray
class Solution {

    public long findMissing(long a[], long b[], int n) {
        // doesnt work for duplicate vaues 
        // for(int i = 0; i < n; i++){
        //     long count = 0;
        //     for(int j = 0; j < n-1; j++){
        //         if(b[j] == a[i]){
        //             count++;
        //         }
        //     }
        //     if(count == 0) return a[i];
        // }
        // return 0;
        
        //works for both duplicate and non-duplicate values
        int sum = 0;
        int ch = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
            ch += b[i];
        }
        if((sum - ch) != 0) return sum-ch; 
        return 0;
    }
}
