//https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
class Solution {
    int minDist(int a[], int n, int x, int y) {
       
        int first=-1;
        int last=-1;
        int result=INT_MAX;
        for(int i=0; i<n; i++){
               if(a[i]==x){
                  first=i;
               }
               if(a[i]==y){
                   last=i;
               }
               if(first!=-1&&last!=-1){
                   result=min(result,abs(first-last));
               }
        }
        if(result==INT_MAX){
               return -1;
         }
        return result;
    }
}
