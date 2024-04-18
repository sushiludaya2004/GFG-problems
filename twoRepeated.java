//https://www.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1
class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        int[] freq = new int[n+1];
        int[] result = new int[2];
        int index = 0;
        for(int i = 0; i<arr.length; i++){
	    freq[arr[i]]++;
	    if(freq[arr[i]] == 2){
            result[index++] = arr[i];
        }
        
        }
        return result;
    }
    
}
