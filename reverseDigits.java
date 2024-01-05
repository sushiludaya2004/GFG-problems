//https://www.geeksforgeeks.org/problems/reverse-digit0316/1
class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        long ans = 0;
        while(n>0){
            long rem = n%10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        return ans;
    }
}
