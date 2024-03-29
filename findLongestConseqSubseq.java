//https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   // add your code here
	   Arrays.sort(arr);
        int max=0;
        int count=1;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                continue;
            }
            else if(arr[i+1]==arr[i]+1)
            {
                count++;
                max=Math.max(count,max);
            }
            else
            {
                count=1;
            }
        }
        if(max==0)
        {
            return 1;
        }
        return max;
	}
}
