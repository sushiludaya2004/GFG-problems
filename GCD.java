//https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
class Solution
{
    public int gcd(int A , int B) 
    { 
        while(B != 0){
            int temp = B;
            B = A % B;
            A = temp;
        }
        
        return A;
    } 
}
