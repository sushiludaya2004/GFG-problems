//https://www.geeksforgeeks.org/problems/palindrome0746/1
class Solution
{
    public String is_palindrome(int n)
    {
        int temp = n;
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        if(ans == temp){
        return "Yes";
        }
        else{
            return "No";
        }
    }
}
