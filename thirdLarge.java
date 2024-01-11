//https://www.geeksforgeeks.org/problems/third-largest-element/1
class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int l = a[0];
	    int sl = 0;
	    int t = 0;
	    for(int i=0; i<n; i++){
	        if(a[i] > l){
	            t = sl;
	            sl = l;
	            l = a[i];
	        }
	        else if(a[i]>sl && a[i] != l ){
	            t=sl;
	            sl = a[i];
	        }
	        else if(a[i]>t && a[i] != sl  ){
	            t = a[i];
	        }
	    }
	    return t;
    }
}
