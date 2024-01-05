//https://www.geeksforgeeks.org/problems/count-digits5716/1
class Solution{
    static int evenlyDivides(int N){
        
        int temp = N; 
        int count = 0;
        int rem ;
        while(temp>0){
            rem = temp % 10;
            if(rem != 0 && N%rem == 0 ) {
                count++;}
            temp /= 10;
        }
        return count;
    }
}
