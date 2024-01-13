//https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
//rotateArrayByOne
class Compute {
    
    public void rotate(int arr[], int n)
    {
        //left rotate
        // int temp = arr[0];
        // for(int i=1; i<n; i++){
        //     arr[i-1] = arr[i];
        // }
        // arr[n-1] = temp;
        
        
        //right rotate
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
  rotateArrayByOne.java
}
