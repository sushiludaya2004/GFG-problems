//https://www.geeksforgeeks.org/problems/square-root/0
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		int i;
		for(i =1; i*i <= x; i++){
		    if(i*i == x){
		        return i;
		    }
		}
		return i-1;
	 }
}
