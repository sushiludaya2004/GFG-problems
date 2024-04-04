//https://www.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number-1587115621/1
class Solution
{
    //Function to find sum of all possible substrings of the given string.
    public static long sumSubstrings(String s)
    {
    //Your code here
    int MOD=1000000007;
    long prev=0;
    long curr=0;
    long sum=0;
    
    for(int i=0; i<s.length(); i++){
        curr=((s.charAt(i)-'0')*(i+1))%MOD + (prev*10)%MOD;
        sum=(sum+curr)%MOD;
        prev=curr;
    }
    return sum; 
    
    }
    
}
