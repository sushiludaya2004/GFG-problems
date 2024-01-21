//https://www.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1
//User function Template for Java
class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        ArrayList<Integer> al = new ArrayList<>();
        
        boolean isPrime[] = new boolean[N+1];
        
        Arrays.fill(isPrime, true);
        
        for(int i = 2; i <= N; i++)
        {
            if(isPrime[i])
            {
                al.add(i);
            }
            
            
            for(int j = i * i; j <= N; j = j+i)
            {
                isPrime[j] = false;
            }
        }
        
        return al;
    }
}
