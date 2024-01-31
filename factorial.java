//https://www.geeksforgeeks.org/problems/factorial5739/1
class Solution{
    public static long fact(long n,long k){
        if(n ==1 || n ==0)  return k;
        return fact(n-2,k * n *( n-1));
    }
    static long factorial(int N){
      
      return fact(N,1);
        
    }
}
