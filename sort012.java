//https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(a[i] < a[j]){
        //             int temp = a[i];
        //             a[i] = a[j];
        //             a[j] = temp;
        //         }
        //     }
        // }
        
        
        //better solution
        // int c0 = 0;
        // int c1 =  0;
        // int c2 = 0;
        // for(int i=0; i<n; i++){
        //     if(a[i] == 0) c0++;
        //     else if(a[i] == 1) c1++;
        //     else c2++;
        // }
        // for(int i=0; i<c0; i++) a[i] = 0;
        // for(int i=c0; i<c0+c1; i++) a[i] = 1;
        // for(int i=c1+c0; i<n; i++) a[i] = 2;
       
       
       //optimized code 
        int l = 0, m = 0, h = n - 1;
        while (m <= h) {
            if (a[m] == 0) {
                // Swap a[l] and a[m]
                int temp = a[l];
                a[l] = a[m];
                a[m] = temp;
                l++;
                m++;
            } else if (a[m] == 1) {
                m++;
            } else {
                // Swap a[m] and a[h]
                int temp = a[m];
                a[m] = a[h];
                a[h] = temp;
                h--;
            }
        }
       
         
    }
}
