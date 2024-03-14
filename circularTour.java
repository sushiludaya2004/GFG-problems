//https://www.geeksforgeeks.org/problems/circular-tour-1587115620/1?page=1&category=Queue&sortBy=submissions
class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	    int ans = 0;
	    int total = 0;
	    int fuel = 0;
	    for(int i=0; i< petrol.length; i++){
	        fuel += petrol[i]-distance[i];
	        if(fuel < 0){
	            ans = i+1;
	            fuel = 0;
	        }
	        total += petrol[i]-distance[i]; 
	    }
	    return total<0?-1:ans;
    }
}
