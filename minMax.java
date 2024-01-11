//https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long large = a[0];
        long small = a[0];
        for(int i=0; i<n; i++){
            if(large < a[i]) large = a[i];
            if(small > a[i]) small = a[i];
        }
        return new Pair(small,large);
    }
}
